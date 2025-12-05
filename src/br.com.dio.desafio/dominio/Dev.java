package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); //pegando todos os conteúdos do bootcamp e adicionando ao conteudosInscritos
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); //pega o primeiro item de conteúdos inscritos
        if(conteudo.isPresent()){ //se o conteúdo existe
            this.conteudosConcluidos.add(conteudo.get()); //adiciona no array de conteúdos concluídos
            this.conteudosInscritos.remove(conteudo.get()); //e remove do array de conteúdos inscritos
        } else{ System.out.println("Você não está matriculado em nenhum conteúdo");} //se não existir nos conteúdos inscritos, fala que não tá matriculado

    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudosInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudosInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { //significa que a classe é FILHA da classe Conteudo, ela ESTENDE dela
    //tudo que eu tenho em Conteúdo, eu tenho em Mentoria
    //Mas nem tudo que eu tenho em Mentoria, eu tenho em conteúdo

    private LocalDate data;

    @Override //esse metodo vem da classe abstrata Conteudo
    // e essa regra que vamos criar aqui, só se aplica em Mentoria, por isso vamos dar o Override e implementar por aqui
    public double calcularXp() { //significa que quando eu criar uma mentoria e chamar o Metodo calcularXP
                        //o XP virará o XP padrão + 20.
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() +
                "descricao='" + getDescricao() +
                ", data=" + data +
                '}';
    }

}

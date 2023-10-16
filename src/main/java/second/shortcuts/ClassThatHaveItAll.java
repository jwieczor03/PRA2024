package second.shortcuts;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {
    String name;
    List<Long> lista;
    Integer number;

    public ClassThatHaveItAll(String name, List<Long> lista, Integer number) {
        this.name = name;
        this.lista = lista;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getLista() {
        return lista;
    }

    public void setLista(List<Long> lista) {
        this.lista = lista;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public void printMe(String info) {
    }
}

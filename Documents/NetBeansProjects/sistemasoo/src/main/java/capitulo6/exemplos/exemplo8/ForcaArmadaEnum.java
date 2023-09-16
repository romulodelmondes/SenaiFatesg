package capitulo6.exemplos.exemplo8;

public enum ForcaArmadaEnum {
    MB("Marinha do Brasil"), EB("Exército Brasileiro"), FAB("Força Aérea Brasileira");

    private final String descricao;

    private ForcaArmadaEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

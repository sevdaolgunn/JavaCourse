public enum Branch {
    MATH("information regarding Math"),
    PHYSICS("information regarding Phy"),
    CS("information regarding Cs"),
    ENG("information regarding eng");

    final private String description;

    Branch(String description) {
        this.description = description;
    }
}

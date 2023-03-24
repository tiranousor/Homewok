public enum Color {
    Copper("медный"),
    Yellow("желтый"),
    Green("зеленый"),
    Brown ("коричневый"),
    Gray ("серый"),
    Purple("фиолетовый");
    private final String title;

    Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title;
    }
}

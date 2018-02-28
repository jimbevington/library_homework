public enum Genre {

    HORROR("Scary books about scary things"),
    THRILLER("Exciting books with things happening in them and that."),
    COMEDY("Funny books to make you giggle."),
    MAGIC_REALISM("Odd books where reality is like reality plus odd bits."),
    CODING_MANUAL("Weird books for weird people.");

    private final String description;

    Genre(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}

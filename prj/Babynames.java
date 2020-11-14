class Babynames {
    int year;
    String gender;
    String name;
    int rank;

public Babynames(int year, String gender, String name, int rank) {
    this.year = year;
    this.gender = gender;
    this.name = name;
    this.rank = rank;
}
public String displayrank() {
    return this.name + " is ranked #" + this.rank + " in year " + this.year;
}
}


 
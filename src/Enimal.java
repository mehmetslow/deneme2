import java.util.Date;

public abstract class Enimal {
    private String name;
    private String typ;
    private Date birthday;
    private String birthPlace;
    private boolean mamals;

    public Enimal(){

    }

    public Enimal(String name, String typ, Date birthday, String birthPlace, boolean mamals) {
        this.name = name;
        this.typ = typ;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
        this.mamals = mamals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public boolean isMamals() {
        return mamals;
    }

    public void setMamals(boolean mamals) {
        this.mamals = mamals;
    }

    @Override
    public String toString() {
        return "Enimal{" +
                "name='" + name + '\'' +
                ", typ='" + typ + '\'' +
                ", birthday=" + birthday +
                ", birthPlace='" + birthPlace + '\'' +
                ", mamals=" + mamals +
                '}';
    }

    public int calculatorAge(Date now){
      int year= now.getYear();
      int birthdayYear= birthday.getYear();
      return year-birthdayYear;

   }


}

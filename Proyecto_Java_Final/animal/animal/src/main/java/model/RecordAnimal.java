package model;

public class RecordAnimal {
    private int animalId;
    private String animalName;
    private String type;
    private int dob;
    private String bread;
    private String owner;
    private int vetId;

    public RecordAnimal(int animalId, String animalName, String type, int dob, String bread, String owner, int vetId) {
        super();
        this.animalId = animalId;
        this.animalName = animalName;
        this.type = type;
        this.dob = dob;
        this.bread = bread;
        this.owner = owner;
        this.vetId = vetId;
    }

    public int getAnimalId() {  //get
        return animalId;
    }
    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {  //get
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getType() {  //get
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getDob() {  //get
        return dob;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getBread() {  //get
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getOwner() {  //get
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getVetId() {  //get
        return vetId;
    }
    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

}


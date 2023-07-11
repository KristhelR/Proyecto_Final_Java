package controller;

public class RecordAVet {
    private int vetId;
    private String vetName;
    private String vetSpeciality;
    private int experience;
    private String clinic;


    public RecordAnimal(int vetlId, String vetName, String vetSpeciality, int experience, String clinic) {
        super();
        this.vetId = vetId;
        this.vetName = vetName;
        this.vetSpeciality = vetSpeciality;
        this.experience = experience;
        this.clinic = clinic;
    }

    public int getVetId() {  //get
        return vetId;
    }
    public void setAnimalId(int vetId) {
        this.vetId = vetId;
    }

    public String getVetName() {  //get
        return vetName;
    }
    public void setAnimalName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetSpeciality() {  //get
        return vetSpeciality;
    }
    public void setVetSpeciality(String vetSpeciality) {
        this.vetSpeciality = vetSpeciality;
    }

    public int getExperience() {  //get
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getClinic() {  //get
        return clinic;
    }
    public void setBread(String clinic) {
        this.clinic = clinic;
    }

}

package lesson19;

public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFlier;
<<<<<<< HEAD
  int numDoc;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFlier, int numDoc){
    super(numShelterInPlace + numEssential + numSkeptic + numFlier + numDoc);
=======
  int numDoctor;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFlier, int numDoctor){
    super(numShelterInPlace + numEssential + numSkeptic + numFlier + numDoctor);
>>>>>>> e9295ee5f5937a4db47af9741f9de1878a15f482
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFlier = numFlier;
<<<<<<< HEAD
    this.numDoc = numDoc;
=======
    this.numDoctor = numDoctor;
>>>>>>> e9295ee5f5937a4db47af9741f9de1878a15f482

  }

  public void createPeople(){
    for(int i=0; i<this.numShelterInPlace; i++){
      this.addPerson(new StayAtHome());
    }
    for(int i=0; i<this.numEssential; i++){
      this.addPerson(new StayAtHomeIfSick());
    }
    for(int i=0; i<this.numSkeptic; i++){
      this.addPerson(new Skeptic());
    }
    for(int i=0; i<this.numFlier; i++){
      this.addPerson(new FrequentFlier());
    }
<<<<<<< HEAD
    for(int i=0; i<this.numDoc; i++){
      this.addPerson(new Doctor());
    }
=======
    for(int i=0; i<this.numDoctor; i++){
        this.addPerson(new Doctor());
      }
>>>>>>> e9295ee5f5937a4db47af9741f9de1878a15f482
  }
}

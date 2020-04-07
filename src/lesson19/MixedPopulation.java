package lesson19;

public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFlier;
  int numDoctor;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFlier, int numDoctor){
    super(numShelterInPlace + numEssential + numSkeptic + numFlier + numDoctor);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFlier = numFlier;
    this.numDoctor = numDoctor;

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
    for(int i=0; i<this.numDoctor; i++){
        this.addPerson(new Doctor());
      }
  }
}

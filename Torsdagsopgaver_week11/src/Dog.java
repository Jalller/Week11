public class Dog {
    private String name;
    private boolean isHungry;
    private String owner;
    private  int numberOfOffsprings = 2;
    private String[] offspring = new String[numberOfOffsprings];

    public int getNumberOfOffsprings() {
        return numberOfOffsprings;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String[] getOffspring() {
        return offspring;
    }

    public void setOffspring(String[] offspring) {
        this.offspring=offspring;
    }

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public String feedDog () {
        if (this.isHungry) {
            System.out.println("isHungry: " + isHungry + " : The dog is hungry");
            this.isHungry = false;
        }
        System.out.println("isHungry: " + isHungry + " : The dog is now full");
        return "The dog is now full";

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        for (int i = 0; i < offspring.length; i++) {
            System.out.println(("offsprings " + offspring[i]));
        }
        return String.format("offsprings " + offspring);
    }
    }



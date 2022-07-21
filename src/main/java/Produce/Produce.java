package Produce;

public abstract class Produce<EdibleType extends Edible>{

    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;
    ProduceStore<Produce<EdibleType>> getList = new ProduceStore<Produce<EdibleType>>();
    Edible obj;
    private Produce<EdibleType> Edible;


    public void yield(){
        getList.foodStore.put(Edible, 30);
    }


}

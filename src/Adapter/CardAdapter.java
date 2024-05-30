package Adapter;

public class CardAdapter implements IUsb {
    private MemoryCard memoryCard;
    public CardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readData();
    }
}
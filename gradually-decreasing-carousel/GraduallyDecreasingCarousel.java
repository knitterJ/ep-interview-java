package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    private final CarouselRun carouselRun;
    private boolean isRunning;
    private int capacity;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
        this.isRunning = false;
        this.capacity = capacity;
        this.carouselRun = new CarouselRun("gradually");
    }

    public boolean addElement(int element) {
        if (isRunning) {
            //throw new UnsupportedOperationException();
            return false;
        }
        if (element > 0 && capacity > 0) {
            carouselRun.getKaruzel().add(element);
            capacity -= 1;
            carouselRun.setElementsToDecreaseWhileRunning(carouselRun.getElementsToDecreaseWhileRunning() + 1);
            return true;
        } else return false;
    }

    public CarouselRun run() {
        if (!isRunning) {
            isRunning = true;
            return carouselRun;
        } else {
            return null;
        }
    }

}

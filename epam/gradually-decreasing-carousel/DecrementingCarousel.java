public class DecrementingCarousel {
    private final CarouselRun carouselRun;
    private int capacity;
    boolean isRunning;
    int elementsToDecreaseWhileRunning;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carouselRun = new CarouselRun("decrementing");
        this.isRunning = false;
        this.elementsToDecreaseWhileRunning = 0;
    }

    public boolean addElement(int element) {

        // if run() method has been called once, don't allow to addElement();
        if (isRunning) {
            //throw new UnsupportedOperationException();
            return false;
        }

        //If element is negative or zero, do not add the element. If container is full, do not add the element.
        if (element > 0 && capacity > 0) {

            // Add an element to the carousel. It's only possible to refer to the "carousel" (the array/instance of CarouselRun class) via getter.
            carouselRun.getKaruzel().add(element);
            capacity -= 1;
            carouselRun.setElementsToDecreaseWhileRunning(carouselRun.getElementsToDecreaseWhileRunning() + 1);

            // If element is added successfully, return true.
            return true;
            // Return false otherwise.
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

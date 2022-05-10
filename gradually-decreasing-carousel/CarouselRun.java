package com.epam.rd.autotasks;

import java.util.ArrayList;

public class CarouselRun {

  private final ArrayList < Integer > karuzel;
  private int currentIndexDecrementPostion;
  public int elementsToDecreaseWhileRunning;
  private final String typeOfCarousel;
  private int amountToDecrease;

  public int getElementsToDecreaseWhileRunning() {
    return elementsToDecreaseWhileRunning;
  }

  public void setElementsToDecreaseWhileRunning(int elementsToDecreaseWhileRunning) {
    this.elementsToDecreaseWhileRunning = elementsToDecreaseWhileRunning;
  }

  public ArrayList < Integer > getKaruzel() {
    return karuzel;
  }

  public CarouselRun(String typeOfCarousel) {
    this.karuzel = new ArrayList < > ();
    this.typeOfCarousel = typeOfCarousel;
    this.amountToDecrease = -1;
  }
  public int next() {
    //The value of elementsToDecreaseWhileRunning comes from the addElement(int element) method, which was defined in CarouselRun Class in the following way. Every time the new element has been added to the carousel the method increases ElementsToDecrease while running by one: carouselRun.setElementsToDecreaseWhileRunning(carouselRun.getElementsToDecreaseWhileRunning() + 1).
    //The variable "elementsToDecreaseWhileRunning" stores the information about how many positive numbers are still in the array. The total amount of positive numbers in the array, allows to control when to stop the whole process of decrementing.
    //If ElementsToDecreaseWhileRunning equals zero, it means that all the elements in the array were brought to value zero.
    if (karuzel.isEmpty() || elementsToDecreaseWhileRunning == 0) {
      return -1;
    }

    int oldValue = karuzel.get(currentIndexDecrementPostion);

    //"newValue" initialization;
    int newValue = 0;

    if (typeOfCarousel.equals("decrementing")) {
      newValue = karuzel.get(currentIndexDecrementPostion) - 1;
    } else if (typeOfCarousel.equals("gradually")) {
      newValue = karuzel.get(currentIndexDecrementPostion) + this.amountToDecrease;

      //Protects against undesired, negative values in the carousel
      if (newValue < 0) {
        newValue = 0;
      }
    }
    karuzel.set(currentIndexDecrementPostion, newValue);

    //The value of elementsToDecreaseWhileRunning comes from the addElement(int element) method, which was defined in CarouselRun Class in the following way. Every time the new element has been added to the carousel, counter ElementsToDecrese increases: carouselRun.setElementsToDecreaseWhileRunning(carouselRun.getElementsToDecreaseWhileRunning() + 1);
    //If new value equals zero, the value of "iteration until the end" (elementsToDecreaseWhileRunning) is decreased by one. It means that, there's one less positive element in the array. The total amount of positive numbers in the array, allows to control when to stop the whole process of decrementing.
    if (newValue == 0) {
      elementsToDecreaseWhileRunning--;
    }
    //Index tracking feature
    this.currentIndexDecrementPostion = calculateNewIndexDecrementPosition(this.currentIndexDecrementPostion);

    //next() based on the instructions should return value of the current element
    return oldValue;
  }

  private int calculateNewIndexDecrementPosition(int currentIndexDecrementPostion) {
    int newIndexDecrementPosition;

    // If no more elements to decrease are present. Meaning the situation where there are only zeroes in the array.
    if (elementsToDecreaseWhileRunning == 0) {
      //basically get out. Could be any other value in return statement.
      return 0;
    }
    //if you reached end of the array, go back to the beginning (0 index). THIS IS THE PLACE WHERE YOU DECREASE THE VALUE FROM -1 TO -2, -2 T0 -3 AND SO ON...
    if (karuzel.size() - 1 == currentIndexDecrementPostion) {
      newIndexDecrementPosition = 0;
      this.amountToDecrease -= 1;
    } else {
      //otherwise go through the elements in the increasing order
      newIndexDecrementPosition = currentIndexDecrementPostion + 1;
    }
    //if the value of the next element in the array also equals zero, call the function again to recalculate (increment) the index.
    if (karuzel.get(newIndexDecrementPosition) == 0) {
      newIndexDecrementPosition = calculateNewIndexDecrementPosition(newIndexDecrementPosition);
    }
    return newIndexDecrementPosition;
  }

  public boolean isFinished() {
    return this.elementsToDecreaseWhileRunning <= 0;
  }

}

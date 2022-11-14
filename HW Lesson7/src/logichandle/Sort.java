package logichandle;

import entity.DriverSchedule;

public class Sort {
    public static void sortByName(DriverSchedule[] driverSchedules) {
        quickSortbyName(driverSchedules, 0, driverSchedules.length-1);
    }

    private static void quickSortbyName(DriverSchedule[] driverSchedules, int lowIndex, int highIndex) {
        DriverSchedule pivot = driverSchedules[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        if (leftPointer >= rightPointer){
            return;
        }
        while (leftPointer < rightPointer) {
            while (driverSchedules[leftPointer].getDriver().getName().compareTo(pivot.getDriver().getName()) > 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (driverSchedules[rightPointer].getDriver().getName().compareTo(pivot.getDriver().getName()) < 0 && leftPointer > rightPointer) {
                rightPointer--;
            }
            swap(driverSchedules, leftPointer, rightPointer);
        }
        swap(driverSchedules, leftPointer, highIndex);
        quickSortbyName(driverSchedules, lowIndex, leftPointer-1);
        quickSortbyName(driverSchedules, leftPointer+1, highIndex);
    }

    private static void swap(DriverSchedule[] driverSchedules, int index1, int index2){
        DriverSchedule temp = driverSchedules[index1];
        driverSchedules[index1] = driverSchedules[index2];
        driverSchedules[index2] = temp;
    }
}

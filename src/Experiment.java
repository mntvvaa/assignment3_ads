import java.util.Arrays;

public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment() {
        sorter = new Sorter();
        searcher = new Searcher();
    }

    public long measureSortTime(int[] arr, String type) {

        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(copy);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("Array Size: " + size);

            int[] randomArray = sorter.generateRandomArray(size);

            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            Arrays.sort(sortedArray);

            System.out.println("Random Array:");

            System.out.println("Bubble Sort Time: " +
                    measureSortTime(randomArray, "basic") + " ns");

            System.out.println("Merge Sort Time: " +
                    measureSortTime(randomArray, "advanced") + " ns");

            System.out.println("Linear Search Time: " +
                    measureSearchTime(randomArray, randomArray[size / 2]) + " ns");

            System.out.println("Sorted Array:");

            System.out.println("Bubble Sort Time: " +
                    measureSortTime(sortedArray, "basic") + " ns");

            System.out.println("Merge Sort Time: " +
                    measureSortTime(sortedArray, "advanced") + " ns");

            System.out.println("Linear Search Time: " +
                    measureSearchTime(sortedArray, sortedArray[size / 2]) + " ns");

            System.out.println("-----------------------------------");
        }
    }
}
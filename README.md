# Sorting and Searching Algorithm Analysis System


## A. Project Overview

This project demonstrates and compares the performance of fundamental sorting and searching algorithms using Java. The experiment analyzes how execution time changes depending on input size and data type.

### Selected Algorithms:
- Bubble Sort (basic sorting algorithm)
- Merge Sort (advanced sorting algorithm)
- Linear Search (searching algorithm)

### Purpose of the experiment:
- To implement and compare sorting and searching algorithms
- To analyze execution time using `System.nanoTime()`
- To understand the difference between theoretical and practical performance (Big-O notation)
  ## B. Algorithm Descriptions

### Bubble Sort
Bubble Sort is a simple comparison-based sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order.

- Time Complexity: O(n²)
- Very inefficient for large datasets

---

### Merge Sort
Merge Sort is a divide-and-conquer algorithm that splits the array into halves, sorts them, and then merges them.

- Time Complexity: O(n log n)
- Efficient for large datasets

---

### Linear Search
Linear Search checks each element one by one until the target value is found.

- Time Complexity: O(n)
- Does not require sorted data

---
## C. Experimental Results

### Array sizes used:
- 10 elements
- 100 elements
- 1000 elements

---
### Observations:
- Bubble Sort becomes extremely slow as array size increases
- Merge Sort is significantly faster and scales well
- Linear Search remains stable but is not efficient for large datasets
- Results match theoretical Big-O complexity
- 
## D. Screenshots

<img width="1280" height="800" alt="5cb9f96a-a9dc-4a5b-b436-6c316ac5da15" src="https://github.com/user-attachments/assets/d581ad25-b2ed-41db-a8a1-eb3ffabee5e8" />
<img width="1280" height="800" alt="44358294-e76f-4722-bed4-b7708862f425" src="https://github.com/user-attachments/assets/1279987c-66fd-4bdf-a858-790d30ad1c46" />
<img width="1280" height="800" alt="11c86310-2cdc-45c6-92ef-733e2672fe55" src="https://github.com/user-attachments/assets/946fe4ab-d3b8-464a-9ecb-32927adc7256" />
## E. Reflection

This project helped me understand the difference between theoretical and practical performance of algorithms. I learned that Bubble Sort is inefficient for large datasets, while Merge Sort performs much better due to its O(n log n) complexity.
Linear Search is simple but not optimal for large data sizes. The experiment also showed that execution time can vary slightly due to system performance and JVM optimization.
One challenge was implementing Merge Sort correctly and ensuring accurate time measurement using `System.nanoTime()`. Overall, this project improved my understanding of algorithm efficiency and real-world performance analysis.

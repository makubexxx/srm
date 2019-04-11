package com.ctbu.srm.service;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/11 16:39
 * @Email 308348194@qq.com
 */

/**
 * 各种排序算法 JAVA 实现
 */
public class Sort {

    /**
     * 直接插入排序
     * @param a
     */

      void insertion_sort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    /**
     * 希尔排序的实质就是分组插入排序，又称缩小增量法。
     *
     * 　　将整个无序序列分割成若干个子序列（由相隔某个“增量”的元素组成的）分别进行直接插入排序，然后依次缩减增量再进行排序，待整个序列中的元素基本有序时，再对全体元素进行一次直接插入排序。
     *
     * 　　因为直接插入排序在元素基本有序的情况下，效率是很高的，因此希尔排序在时间效率上有很大提高。
     * @param a
     */
    void shell_sort(int[] a) {
        int n = a.length;
        int i, j, k, gap;
        for (gap = n / 2; gap > 0; gap /= 2) {
            for (i = 0; i < gap; i++) {
                for (j = i + gap; j < n; j += gap) {
                    int temp = a[j];
                    for (k = j - gap; k >= 0 && a[k] > temp; k -= gap) {
                        a[k + gap] = a[k];
                    }
                    a[k + gap] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序的思想，是让最大的数浮动到数组最后的位置，其次大的数浮动到数组倒数第二个位置……
     * @param a
     * @param size
     */
    void bubble_sort(int a[], int size)
    {
        int i, j, t;
        for(i = 1; i < size; ++i){
            for(j = 0; j < size -i; ++j){
                if(a[j] > a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            } // end for j
        }// end for i
    }

    /**
     *采用最简单的选择方式：从头到尾扫描序列找出最小的记录和第一个记录交换，接着在剩下的记录中继续这种选择和交换，最终使序列有序
     *  * 时间复杂度：O（n^2）
     *  * 此算法的额外空间只有一个temp，因此空间复杂度为O（1）
     * @param a
     */
    void  selection_sort(int[] a){
                 int i,j,k;
                 int temp;
                 for(i=0;i<a.length;i++){
                         k=i;//k表示最小的元素的坐标；
                         //在无序序列中找到最小的元素
                         for(j=i+1;j<a.length;j++){
                                 if(a[k]>a[j]){
                                         k=j;
                                     }
                             }
                         //最小元素和无序序列的第一个元素交换
                         temp = a[k];
                         a[k]=a[i];
                         a[i]=temp;
                     }
             }


    /**
     * 堆排序
     * @param A
     * @param n
     * @return
     */
    int[] heap_sort(int[] A, int n) {
        // 首先建立最小堆，父节点若大于等于0，则调整堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapAdjust(A, i, n);
        }
        for (int i = 1; i < n; i++) {
            // 调换第一个数和最后一个数
            swap(A, 0, n - i);
            // 调整堆
            heapAdjust(A, 0, n - i);
        }
        return A;
    }


    // 从节点i开始调整，n为节点总数 从0开始计算 i 的子节点为 2*i+1 和 2*i+2,父节点为(i-1)/2
    void heapAdjust(int[] data, int i, int n) {
        int temp = data[i];
        int childLeft = 2 * i + 1;
        int childRight = 2 * i + 2;
        while (childLeft < n) {
            // 先从两个子节点中选择最小的
            if (childRight < n && data[childRight] < data[childLeft])
                childLeft++;

            // 如果子节点大于父节点，则退出
            if (data[childLeft] >= temp)
                break;
                // 如果子节点小于父节点，则交换
            else {
                data[i] = data[childLeft];
                i = childLeft;
                childLeft = 2 * i + 1;
                childRight = 2 * i + 2;
            }
        }
        data[i] = temp;
    }
    void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}

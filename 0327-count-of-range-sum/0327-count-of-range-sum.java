class Solution {

        public int countRangeSum(int[] nums, int lower, int upper) {

                long[] prefix = new long[nums.length + 1];

                        for (int i = 0; i < nums.length; i++) {
                                    prefix[i + 1] = prefix[i] + nums[i];
                                            }

                                                    return mergeSort(prefix, 0, prefix.length,
                                                                             lower, upper);
                                                                                 }

                                                                                     private int mergeSort(long[] arr, int left, int right,
                                                                                                               int lower, int upper) {

                                                                                                                       if (right - left <= 1)
                                                                                                                                   return 0;

                                                                                                                                           int mid = (left + right) / 2;

                                                                                                                                                   int count = 0;

                                                                                                                                                           count += mergeSort(arr, left, mid, lower, upper);
                                                                                                                                                                   count += mergeSort(arr, mid, right, lower, upper);

                                                                                                                                                                           int low = mid;
                                                                                                                                                                                   int high = mid;

                                                                                                                                                                                           for (int i = left; i < mid; i++) {

                                                                                                                                                                                                       while (low < right &&
                                                                                                                                                                                                                          arr[low] - arr[i] < lower) {
                                                                                                                                                                                                                                          low++;
                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                  while (high < right &&
                                                                                                                                                                                                                                                                                     arr[high] - arr[i] <= upper) {
                                                                                                                                                                                                                                                                                                     high++;
                                                                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                                                                                             count += high - low;
                                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                                             long[] temp = new long[right - left];

                                                                                                                                                                                                                                                                                                                                                     int i = left;
                                                                                                                                                                                                                                                                                                                                                             int j = mid;
                                                                                                                                                                                                                                                                                                                                                                     int k = 0;

                                                                                                                                                                                                                                                                                                                                                                             while (i < mid && j < right) {

                                                                                                                                                                                                                                                                                                                                                                                         if (arr[i] <= arr[j])
                                                                                                                                                                                                                                                                                                                                                                                                         temp[k++] = arr[i++];
                                                                                                                                                                                                                                                                                                                                                                                                                     else
                                                                                                                                                                                                                                                                                                                                                                                                                                     temp[k++] = arr[j++];
                                                                                                                                                                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                                                                                                                                                                                     while (i < mid)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                 temp[k++] = arr[i++];

                                                                                                                                                                                                                                                                                                                                                                                                                                                                         while (j < right)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     temp[k++] = arr[j++];

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             for (i = 0; i < temp.length; i++)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         arr[left + i] = temp[i];

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 return count;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
}
class Solution {
        public int findNthDigit(int n) {

                long digits = 1;
                        long count = 9;
                                long start = 1;

                                        // Find which group n belongs to
                                                while (n > digits * count) {
                                                            n -= digits * count;

                                                                        digits++;
                                                                                    count *= 10;
                                                                                                start *= 10;
                                                                                                        }

                                                                                                                // Find the actual number
                                                                                                                        long number = start + (n - 1) / digits;

                                                                                                                                // Find the digit inside that number
                                                                                                                                        int index = (int)((n - 1) % digits);

                                                                                                                                                return String.valueOf(number).charAt(index) - '0';
                                                                                                                                                    }
                                                                                                                                                    
}
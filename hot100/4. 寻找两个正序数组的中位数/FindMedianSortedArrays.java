public class FindMedianSortedArrays {
    public static void main(String[] args) {
        // 寻找两个正序数组的中位数
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        return (getKth(nums1, 0, m - 1, nums2, 0, n - 1, left) + getKth(nums1, 0, m - 1, nums2, 0, n - 1, right)) * 0.5;
    }

    private static double getKth(int[] nums1, int i, int i1, int[] nums2, int i2, int i3, int left) {
        int m = i1 - i + 1;
        int n = i3 - i2 + 1;
        if (m > n) {
            return getKth(nums2, i2, i3, nums1, i, i1, left);
        }
        if (m == 0) {
            return nums2[i2 + left - 1];
        }
        if (left == 1) {
            return Math.min(nums1[i], nums2[i2]);
        }
        int i4 = i + Math.min(m, left / 2) - 1;
        int i5 = i2 + Math.min(n, left / 2) - 1;
        if (nums1[i4] < nums2[i5]) {
            return getKth(nums1, i4 + 1, i1, nums2, i2, i3, left - (i4 - i + 1));
        } else {
            return getKth(nums1, i, i1, nums2, i5 + 1, i3, left - (i5 - i2 + 1));
        }
    }
}

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();

        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;   // search further left
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;    // search further right
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        ans.add(first);
        ans.add(last);

        return ans;
    }
}
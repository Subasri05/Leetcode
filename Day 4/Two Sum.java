class Solution{
    public static int[] twoSum(int arr[], int target){
	int[] result = new int[2];
	for(int i=0; i<arr.length-1; i++){
		for(int j=i+1; j<arr.length; j++){
			if(arr[i] + arr[j] == target){
				result[0] = i;
				result[1] = j;
				return result;
				}
			}
		}
		return result;
	}
}

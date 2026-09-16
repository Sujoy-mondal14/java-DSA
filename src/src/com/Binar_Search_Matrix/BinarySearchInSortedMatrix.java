package com.Binar_Search_Matrix;

import java.util.Arrays;

public class BinarySearchInSortedMatrix {
    static void main() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 9;
        System.out.println(Arrays.toString(binarSearchmatrix(matrix,target)));
    }
    // search in the row provided btw the column provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart+(cEnd-cStart)/2;

            if(matrix[row][mid] == target) return  new int[]{row,mid};

            if ( target > matrix[row][mid]) cStart = mid +1;
            else cEnd = mid-1;
        }
        return new int[]{-1,-1};
    }

    static int[] binarSearchmatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1) return binarySearch(matrix,0,0,col-1,target);

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        // run this loop till 2 rows are left->
        while(rStart < rEnd -1){ // when this is true more than two rows are there
            int mid = rStart + (rEnd-rStart)/2;

            if(matrix[mid][cMid] == target ) return  new int[]{mid,cMid};

            if(target > matrix[mid][cMid]) rStart = mid;
            else rEnd = mid;
        }

        // now we have 2 rows
        // check if the target is at the mid-col of the 2 rows
        if(matrix[rStart][cMid] == target) return new int[]{rStart,cMid};
        if(matrix[rStart+1][cMid] == target) return new int[]{rStart+1,cMid};

        // if not fpund:
        // search in 1st half:
        if(target <= matrix[rStart][cMid-1]) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half:
        else if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        // search in 3rd half:
        else if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half:
        else{
            return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
        }
    }
}

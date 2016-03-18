package stLab1;
public class riangle {	
	public String whichTri(int a, int b, int c){				
        int[] list = new int[]{a, b, c};
        for( int i = 0; i < 3; i++ ){
        	for( int j = i; j < 3; j++ ){
        		if( list[i] < list[j]){
        			int temp = list[i];
        			list[i] = list[j];
        			list[j] = temp;
        		}
        	}
        }
        a = list[0];
        b = list[1];
        c = list[2];
        if( c <= 0 || b + c <= a || a - c >= b || a - b >= c )
        	return "noTri";        
        else if( a == b && b == c)
			return "eTri";
        else if( a == b || a == c || b ==c )
        	return "iTri";
        else
		    return "sTri";		
	}	
}

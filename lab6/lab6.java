package lab6;



 class lab6 {
	    private int[][] operand1;
	    private int[][] operand2;
	    private String operator;


	    public lab6(int[][] operand1, int[][] operand2, String operator) {
	        this.operand1 = operand1;
	        this.operand2 = operand2;
	        this.operator = operator;
	    }


	    private int[][] addition(int[][] op1, int[][] op2) {
	        int rows = op1.length;
	        int cols = op1[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = op1[i][j] + op2[i][j];
	            }
	        }
	        return result;
	    }
	    private int[][] subtraction(int[][] op1, int[][] op2) {
	        int rows = op1.length;
	        int cols = op1[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = op1[i][j] - op2[i][j];
	            }
	        }
	        return result;
	    }

	    private int[][] multiplication(int[][] op1, int[][] op2) {
	        int r1 = op1.length;
	        int c1 = op1[0].length;
	        int c2 = op2[0].length;
	        int[][] result = new int[r1][c2];

	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    result[i][j] += op1[i][k] * op2[k][j];
	                }
	            }
	        }
	        return result;
	    }

	    public int[][] chooseOperation() {
	        int[][] result = null;
	        switch (operator) {
	            case "+":
	                result = addition(operand1, operand2);
	                break;
	            case "-":
	                result = subtraction(operand1, operand2);
	                break;
	            case "*":
	                result = multiplication(operand1, operand2);
	                break;
	            default:
	                System.out.println("Буруу оператор!");
	                return null;
	        }
	        printMatrix(result);
	        return result;
	    }
	    private void printMatrix(int[][] pmatrix) {
	        System.out.println("Үр дүн:");
	        for (int[] row : pmatrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
	}



	 
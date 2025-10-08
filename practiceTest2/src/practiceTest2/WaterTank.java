package practiceTest2;

	public class WaterTank {
		private int liters;
		public WaterTank(int starting) { this.liters = starting; }
		public int getLiters() { return liters; }
		public boolean fill(int amt) {
			if(amt < 0) {
				return false;
			}
			if(amt > 0) {
				this.liters += amt;
				return true;
			}
			return false;
		}
		public boolean drain(int amt) {
			if (amt > this.liters) {
				return false;
			} else {
				this.liters -= amt;
				return true;
			}
		
		}
		public static void main(String[] args) {
			WaterTank t = new WaterTank(10);
			System.out.println(t.getLiters());
			// Test 1: negative fill should fail
			boolean test1_result = t.fill(-5);
			System.out.println(test1_result);
			System.out.println(t.getLiters());
			// Test 2: positive fill should succeed
			boolean test2_result = t.fill(5);
			System.out.println(test2_result);
			System.out.println(t.getLiters());
			// Test 3: drain more than current amount should fail
			boolean test3_result = t.drain(16);
			System.out.println(test3_result);
			System.out.println(t.getLiters());
			// Test 4: valid drain should succeed
			boolean test4_result = t.drain(14);
			System.out.println(test4_result);
			System.out.println(t.getLiters());
		}
	}


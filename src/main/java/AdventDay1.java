

class AdventDay1{
    public String dayOneTest(){
        return "Day 1 Test";
    }

	public Integer findReqFuel(int i) {
        
        int fuel;        
        fuel = (int) (Math.floor((i / 3)) - 2);
        return fuel;
	}

	public Integer findTotalReqFuel(int[] massValues) {
        int totalMass = 0;

        for(int mass:massValues){
            totalMass += this.findReqFuel(mass);
        }
        
        return totalMass;
	}
}
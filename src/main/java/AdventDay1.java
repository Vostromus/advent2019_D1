

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

	public Integer fuelReqFuel(int i) {
        
        int totalFuel,mass;

        totalFuel = 0;
        mass = i;

        do{
            mass = this.findReqFuel(mass);
            if(mass >= 0)
                totalFuel += mass;
        }while(mass >= 0);
        
        return totalFuel;
	}

	public Integer totalFuelReqFuel(int[] testValues) {
        
        int totalFuel = 0;
        for(int val:testValues){
            totalFuel += this.fuelReqFuel(val);
        }
        return totalFuel;
	}
}
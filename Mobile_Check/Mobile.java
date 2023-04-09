package Ceo;

public class Mobile {

		//States
		String m_name,color;
		double price;
		//Lazy Instantiation

		Sim slot1,slot2;

		//connst
		private Mobile(){
			//L.I
		}
		public Mobile(String m_name,String color,double price){
			//L.I
			this.m_name=m_name;
			this.color=color;
			this.price=price;
		}
		//Behaviour
		public void insertSim1(Sim slot1){
			//willing to insert Sim means slot1 should be empty
			if(this.slot1==null){
				//task of inserting
				this.slot1=slot1;
				System.out.println("Sim-1 Inserted Succesfully"); 
			}else{
				//Sim is Present
				System.out.println("Can't Add The Sim-1 Bcz Sim is Already Present");
			}
		}
		public void insertSim2(Sim slot2){
			
			//willing to insert Sim in Slot2
			if(this.slot2==null){
				//task of inserting
				this.slot2=slot2;
				System.out.println("Sim-2 Inserted Succesfully"); 
			}else{
				//Sim is Present
				System.out.println("Can't Add The Sim-2 Bcz Sim is Already Present");
			}
		}
		public void removeSim1(){
			//To Remove Sim From Slot 1
			if(this.slot1!=null){
				//Sim is Present
				this.slot1=null;
				System.out.println("Sim-1 Removed Succesfully");
			}else{
				//Sim is Not Present
				System.out.println("Already Sim is Removed From Slot-1");
			}
		}
		
		public void removeSim2(){
			//To Remove Sim From Slot 2
			if(this.slot2!=null){
				//Sim is Present
				this.slot2=null;
				System.out.println("Sim-2 Removed Succesfully");
			}else{
				//Sim is Not Present
				System.out.println("Already Sim is Removed From Slot-2");
			}
		}

		public boolean isSim1isPresent(){
			//returning true means sim is Present else not present
			if(this.slot1!=null){
				return true;//+ve reply sim is presnt
			}else{
				return false;//-ve reply sim is not Present
			}
		}
		public boolean isSim2isPresent(){
			//returning true means sim is Present else not present
			if(this.slot2!=null){
				return true;//+ve reply sim is presnt
			}else{
				return false;//-ve reply sim is not Present
			}
		}
		public void detailsOfMobile(){
			System.out.println("The Mobile Name is :"+m_name);
			System.out.println("The Mobile Color is :"+this.color);
			System.out.println("The Mobile Price is :"+price);
			System.out.println("************************************");
		}

	}



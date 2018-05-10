class SubscriberInfo {
		String name, id,password;
		String phoneNo,address;
		SubscriberInfo (String name, String id, String password) {
			this.name=name;
			this.id=id;
			this.password=password;	
		}
		SubscriberInfo(String name, String id, String password,String phoneNo,String address){
			this.name=name;
			this.id=id;
			this.password=password;
			this.phoneNo=phoneNo;
			this.address=address;	
		}
		void changePassword(String password) {
			this.password=password;
		}
		void setphoneNo(String phoneNo) {
			this.phoneNo=phoneNo;
		}
		void setaddress(String address) {
			this.address=address;
		}
		
	}




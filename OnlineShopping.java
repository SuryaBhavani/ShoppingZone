import java.util.*;
public class OnlineShopping {
	public static void main(String[]args) {
		System.out.println("Enter Username");
		Scanner user=new Scanner(System.in);
		String userName=user.nextLine();
		System.out.println(userName.toUpperCase()+",Enter your email id");
		Scanner mail=new Scanner(System.in);
		String mailId=mail.nextLine();
		System.out.println("Enter password");
		Scanner password=new Scanner(System.in);
		String passwordDetails=password.nextLine();
		//To store some existing user details
		String userNameArray[]= {"SuryaBhavani","Sita","Sandya","Lavanya","Prabha"};
		String mailIdArray[]= {"surya@gmail.com","sita123@email.co","sandya234@redifmail.com","lavanya@gmail.com","prabha@gec.in"};
		String passwordArray[]= {"admin12345","sita1111","sandya222","lavanya333","prabha111"};
		//To extend the size of array
		ArrayList userNameAL=new ArrayList(Arrays.asList(userNameArray));
		ArrayList mailIdAL=new ArrayList(Arrays.asList(mailIdArray));
		ArrayList passwordAL=new ArrayList(Arrays.asList(passwordArray));
		
		//To store data related to products
		String category[]= {"FRUITS","VEGETABLES","SNACKS","COSMETICS"};
		String fruitsInfo[]= {"APPLES","BANANA","ORANGE","GRAPES","PINEAPPLE"};
		int fruitsPrice[]= {100,40,75,150,30};
		int fruitsQuantity[]= {5000,2000,1000,100,250};
		int fruitPurchaseHistory[]= {1000,200,10,50,200};
		String veggiesInfo[]= {"POTATOS","TOMATOS","CARROTS","BEETROOT","RADISH","ONION"};
		int veggisPrice[]= {50,60,90,70,50,100};
		int VeggiesQuantity[]= {1000,200,300,400,500,1000};
		int veggiesPurchaseHistory[]= {400,20,150,200,290,750};
		String snacksInfo[]= {"OREO","DARKFANTASY","KITKAT","LAYS","5STAR"};
		int snacksPrice[]= {45,5,10,20,10};
		int snacksQuantity[]= {100,200,300,400,500};
		int snacksPurchaseHistory[]= {20,175,211,233,245};
		String cosmeticInfo[]= {"facewash","soaps","toothpaste","lipstick"};
		int cosmeticsPrice[]= {45,60,79,199};
		int cosmeticsQuantity[]= {1000,2000,3000,4000};
		int cosmeticsPurchaseHistory[]= {875,1736,2334,1222};
		//To extend the size of given arrays
		ArrayList categoryAL=new ArrayList(Arrays.asList(category));
		ArrayList fruitsInfoAL=new ArrayList(Arrays.asList(fruitsInfo));
		ArrayList fruitsPriceAL=new ArrayList(Arrays.asList(fruitsPrice));
		ArrayList fruitsQuantityAL=new ArrayList(Arrays.asList(fruitsQuantity));
		ArrayList veggiesInfoAL=new ArrayList(Arrays.asList(veggiesInfo));
		ArrayList veggiesPriceAL=new ArrayList(Arrays.asList(veggisPrice));
		ArrayList VeggiesQuantityAL=new ArrayList(Arrays.asList(VeggiesQuantity));
		ArrayList snacksInfoAL=new ArrayList(Arrays.asList(snacksInfo));
		ArrayList snacksPriceAL=new ArrayList(Arrays.asList(snacksPrice));
		ArrayList snacksQuantityAL=new ArrayList(Arrays.asList(snacksQuantity));
		ArrayList cosmeticInfoAL=new ArrayList(Arrays.asList(cosmeticInfo));
		ArrayList cosmeticsPriceAl=new ArrayList(Arrays.asList(cosmeticsPrice));
		ArrayList cosmeticsQuantityAL=new ArrayList(Arrays.asList(cosmeticsQuantity));
		//purchase history array
		//Admin Zone
		int flag3=0;
		if(userName.equalsIgnoreCase(userNameArray[0]) && (mailId.equals(mailIdArray[0])&&(passwordDetails.equals(passwordArray[0])||flag3==1)) ) {
			System.out.println("WELCOME ADMIN\n");
			for(int j=0;j<4;j++) {
			
			System.out.println("WHICH CATEGORY'S PRODUCT DETAILS WOULD YOU LIKE TO CHECK\n");
			System.out.println(categoryAL);
			Scanner cat=new Scanner(System.in);
			String typeSelected=cat.nextLine();
			if(typeSelected.equalsIgnoreCase("fruits")){
				System.out.println("YOU ARE GETTING 10% OUT OF TOTAL COST FROM THIS CATEGERY");
				System.out.println("FRUITS NAMES --- COST_PER_UNIT --- QUANTITY_AVAILABLE --- QUANTITY_SOLD --- AMOUNT_EARNED");
				for(int i=0;i<fruitsInfo.length;i++) {
					System.out.println(fruitsInfo[i]+"  --------  "+fruitsPrice[i]+"  ---------  "+fruitsQuantity[i]+"  ---------  "+fruitPurchaseHistory[i]+"  --------  "+fruitPurchaseHistory[i]*fruitsPrice[i]*0.1);
				
				}
				System.out.println("WOULD YOU LIKE TO SEE OTHER CATEGORIES DETAILS");
				System.out.println("ENTER \"Y\" IF YES OR \"N\" IF NO");
				Scanner s=new Scanner(System.in);
				String y=s.nextLine();
				if(y.equalsIgnoreCase("y")) {
					continue;
				}
				else {
					break;
				}
			}else if(typeSelected.equalsIgnoreCase("vegetables")){
				System.out.println("YOU ARE GETTING 25% OUT OF TOTAL COST FROM THIS CATEGERY");
				System.out.println("VEGETABLE NAMES --- COST_PER_UNIT --- QUANTITY_AVAILABLE_IN_KGS --- QUANTITY_SOLD ---AMOUNT_EARNED");
				for(int i=0;i<veggiesInfoAL.size();i++) {
					System.out.println(veggiesInfo[i]+"  --------  "+veggisPrice[i]+"  ---------  "+VeggiesQuantity[i]+"  ---------  "+veggiesPurchaseHistory[i]+"  --------  "+veggiesPurchaseHistory[i]*veggisPrice[i]*0.25);
				}
				System.out.println("WOULD YOU LIKE TO SEE OTHER CATEGORIES DETAILS");
				System.out.println("ENTER \"Y\" IF YES OR \"N\" IF NO");
				Scanner s=new Scanner(System.in);
				String y=s.nextLine();
				if(y.equalsIgnoreCase("y")) {
					continue;
				}
				else {
					break;
				}
			}else if(typeSelected.equalsIgnoreCase("SNACKS")){
				System.out.println("YOU ARE GETTING 20% OUT OF TOTAL COST FROM THIS CATEGERY");
				System.out.println("SNACKS NAMES --------- COST_PER_UNIT -------- QUANTITY_AVAILABLE_IN_KGS --------QUANTITY_SOLD ------AMOUNT_EARNED");
				for(int i=0;i<snacksInfoAL.size();i++) {
					System.out.println(snacksInfo[i]+"  --------  "+snacksPrice[i]+"  ---------  "+snacksQuantity[i]+"  ---------  "+snacksPurchaseHistory[i]+"  --------  "+snacksPurchaseHistory[i]*snacksPrice[i]*0.2);
				}
				System.out.println("WOULD YOU LIKE TO SEE OTHER CATEGORIES DETAILS");
				System.out.println("ENTER \"Y\" IF YES OR \"N\" IF NO");
				Scanner s=new Scanner(System.in);
				String y=s.nextLine();
				if(y.equalsIgnoreCase("y")) {
					continue;
				}
				else {
					break;
				}
			}else if(typeSelected.equalsIgnoreCase("COSMETICS")){
				System.out.println("YOU ARE GETTING 34% OUT OF TOTAL COST FROM THIS CATEGERY");
				System.out.println("COSMETICS NAMES --------- COST_PER_UNIT -------- QUANTITY_AVAILABLE_IN_KGS --------QUANTITY_SOLD ------AMOUNT_EARNED");
				for(int i=0;i<cosmeticInfoAL.size();i++) {
					System.out.println(cosmeticInfo[i]+"  --------  "+cosmeticsPrice[i]+"  ---------  "+cosmeticsQuantity[i]+"  ---------  "+cosmeticsPurchaseHistory[i]+"  --------  "+cosmeticsPurchaseHistory[i]*cosmeticsPrice[i]*0.34);
				}
			}System.out.println("WOULD YOU LIKE TO SEE OTHER CATEGORIES DETAILS");
			System.out.println("ENTER \"Y\" IF YES OR \"N\" IF NO");
			Scanner s=new Scanner(System.in);
			String y=s.nextLine();
			if(y.equalsIgnoreCase("y")) {
				continue;
			}
			else {
				break;
			}
			}
			
		}else if(userName.equalsIgnoreCase(userNameArray[1]) && (mailId.equals(mailIdArray[1])&&(passwordDetails.equals(passwordArray[1])))){
			System.out.println("WELCOME TO OUR WEBSITE ,SELLER");
			System.out.println("WOULD YOU LIKE TO SELL MORE THAN ONE TYPE OF PRODUCT?\n IF YES,ENTER \"y\" ELSE ENTER \"n\"");
			int numbers=0;
			Scanner s=new Scanner(System.in);
			String type=s.nextLine();
			if(type.equalsIgnoreCase("y")) {
				System.out.println("ENTER NUMBER");
				Scanner n=new Scanner(System.in);
				int number=n.nextInt();
				numbers=number;
			}
			for(int i=0;i<=numbers;i++) {
				System.out.println("ENTER THE CATEGORY OF YOUR PRODUCT");
				System.out.println(categoryAL);
				Scanner s1=new Scanner (System.in);
				String response1 =s1.nextLine();
				if(response1.equalsIgnoreCase("Fruits")){
					System.out.println("Enter the name of item");
					Scanner item=new Scanner(System.in);
					String itemName=item.nextLine();
					fruitsInfoAL.add(itemName);
					System.out.println("Enter the quantity you are going to sell");
					Scanner quan=new Scanner(System.in);
					int quantity=quan.nextInt();
					fruitsQuantityAL.add(quantity);
					System.out.println("Enter the cost per unit");
					Scanner cost=new Scanner(System.in);
					int costPerUnit=cost.nextInt();
					fruitsPriceAL.add(costPerUnit);
					System.out.println("You will earn an amount of "+costPerUnit*quantity*0.9+" $  on the item "+itemName);
					System.out.println("10% of the total amount will go to the website for this category of products");
				}
				else if(response1.equalsIgnoreCase("vegetables")){
					System.out.println("Enter the name of item");
					Scanner item=new Scanner(System.in);
					String itemName=item.nextLine();
					veggiesInfoAL.add(itemName);
					System.out.println("Enter the quantity you are going to sell");
					Scanner quan=new Scanner(System.in);
					int quantity=quan.nextInt();
					VeggiesQuantityAL.add(quantity);
					System.out.println("Enter the cost per unit");
					Scanner cost=new Scanner(System.in);
					int costPerUnit=cost.nextInt();
					veggiesPriceAL.add(costPerUnit);
					System.out.println("You will earn an amount of "+costPerUnit*quantity*0.75+" $  on the items "+itemName);
					System.out.println("25% of the total amount will go to the website for this category of products");
				}else if(response1.equalsIgnoreCase("snacks")){
					System.out.println("Enter the name of item");
					Scanner item=new Scanner(System.in);
					String itemName=item.nextLine();
					snacksInfoAL.add(itemName);
					System.out.println("Enter the quantity you are going to sell");
					Scanner quan=new Scanner(System.in);
					int quantity=quan.nextInt();
					snacksQuantityAL.add(quantity);
					System.out.println("Enter the cost per unit");
					Scanner cost=new Scanner(System.in);
					int costPerUnit=cost.nextInt();
					snacksPriceAL.add(costPerUnit);
					System.out.println("You will earn an amount of "+costPerUnit*quantity*0.80+" $  on the items "+itemName);
					System.out.println("20% of the total amount will go to the website for this category of products");
				}
				else if(response1.equalsIgnoreCase("cosmetics")){
					System.out.println("Enter the name of item");
					Scanner item=new Scanner(System.in);
					String itemName=item.nextLine();
					cosmeticInfoAL.add(itemName);
					System.out.println("Enter the quantity you are going to sell");
					Scanner quan=new Scanner(System.in);
					int quantity=quan.nextInt();
					cosmeticsQuantityAL.add(quantity);
					System.out.println("Enter the cost per unit");
					Scanner cost=new Scanner(System.in);
					int costPerUnit=cost.nextInt();
					cosmeticsPriceAl.add(costPerUnit);
					System.out.println("You will earn an amount of "+costPerUnit*quantity*0.66+" $  on the items "+itemName);
					System.out.println("34% of the total amount will go to the website for this category of products");
				}
			}
		}
		else {
		
		int flag=0;
		for(int i=2;i<5;i++) {
			if(userName.equalsIgnoreCase(userNameArray[i]) && (mailId.equals(mailIdArray[i])&&(passwordDetails.equals(passwordArray[i]))) ) {
				flag=1;
				break;
			}
			
			}
		if(flag==0) {
			System.out.println("The credintials entered are incorrect\n");
			System.out.println("Doesn't have an account,Please sign up\n");
			System.out.println("To sign up enter \"  Y \"\n");
			Scanner verify=new Scanner(System.in);
			String check=verify.nextLine();
			if (check.equalsIgnoreCase("y")) {
				System.out.println("Enter Username");
				Scanner user1=new Scanner(System.in);
				String userName1=user1.nextLine();
				System.out.println(userName1.toUpperCase()+",Enter your email id");
				Scanner mail1=new Scanner(System.in);
				String mailId1=mail1.nextLine();
				System.out.println("Enter password");
				Scanner password1=new Scanner(System.in);
				String passwordDetails1=password1.nextLine();
				System.out.println("Please re-enter password to confirm");
				Scanner passwordCheck=new Scanner(System.in);
				String passwordReentered=passwordCheck.nextLine();
				if(passwordDetails1.equals( passwordReentered)) {
					System.out.println("Account created Sucessfully");
				userNameAL.add(userName1);
				mailIdAL.add(mailId1);
				passwordAL.add(passwordDetails1);
				}
				else {
					System.out.println("wrong password");
				}
				
			}
		}
		//Shopping  Zone
		int flag2=0;
		int total_cost=0;
		int money=0;
		for(int z=0;z<10;z++) {
			if(mailIdAL.contains(mailId)||(mailIdAL.size()>5)||flag2==1){
				if(money==0) {
				System.out.println("WELCOME TO SHOPPING ZONE");
				System.out.println("***LETS DIVE INTO THE SHOPPING***\n");
				System.out.println("$$$$PLEASE ADD MONEY TO YOUR WALLET$$$$\n");
				Scanner readMoney=new Scanner(System.in);
				money=readMoney.nextInt();
				}
				if(money!=0) {
					System.out.println("SELECT THE PRODUCT CATEGOER");
					System.out.println(categoryAL);
					Scanner readCategory=new Scanner(System.in);
					String selectedCG=readCategory.nextLine();
					if(selectedCG.equalsIgnoreCase("fruits")) {
						System.out.println(fruitsInfoAL);
						System.out.println("Enter the number of products you would like to buy");
						Scanner number=new Scanner(System.in);
						int num=number.nextInt();
						//int total_cost=0;
						for (int i=0;i<num;i++) {
							System.out.println("Enter the name of item");
							Scanner item=new Scanner(System.in);
							String itemName=item.nextLine();
							for(int j=0;j < fruitsInfoAL.size();j++)
							if (itemName.equalsIgnoreCase(fruitsInfo[j])&&(total_cost<=money)) {
								System.out.println("Enter the quantity required");
								Scanner quan=new Scanner(System.in);
								int quantity=quan.nextInt();
								System.out.println("Cost per unit:"+fruitsPrice[j]);
								int  single_cost=quantity*fruitsPrice[j];
								System.out.println("The cost of "+fruitsInfo[j]+" of quantity "+quantity+" is "+single_cost);
								
									total_cost +=single_cost;
								
							if(total_cost<=money) {
									System.out.println("total purchase cost  "+total_cost);	
									
											
							}	else {
									System.out.println("you have exceeded your wallet range,please add money to your wallet");
								}
							}
			            }System.out.println("WOULD YOU LIKE TO SHOP FROM ANOTHER CATEGORY OF PRODUCTS");
						System.out.println("ENTER \"Y\",TO CONTINUE");
						Scanner opt=new Scanner(System.in);
						String choice=opt.nextLine();
						if(choice.equalsIgnoreCase("y")) {
							flag2=1;
						}
						else {
							System.out.println("***THANK YOU FOR SHOPPING, VISIT AGAIN***");
							break;
						}
					}else if(selectedCG.equalsIgnoreCase("VEGETABLES")) {
						System.out.println(veggiesInfoAL);
						System.out.println("Enter the number of products you would like to buy");
						Scanner number=new Scanner(System.in);
						int num=number.nextInt();
						//int total_cost=0;
						for (int i=0;i<num;i++) {
							System.out.println("Enter the name of item");
							Scanner item=new Scanner(System.in);
							String itemName=item.nextLine();
							for(int j=0;j < veggiesInfoAL.size();j++)
							if (itemName.equalsIgnoreCase(veggiesInfo[j])&&(total_cost<=money)) {
								System.out.println("Enter the quantity required");
								Scanner quan=new Scanner(System.in);
								int quantity=quan.nextInt();
								System.out.println("Cost per unit:"+veggisPrice[j]);
								int  single_cost=quantity*veggisPrice[j];
								System.out.println("The cost of "+veggiesInfo[j]+" of quantity "+quantity+" is "+single_cost);
								 
									total_cost +=single_cost;
								
								if(total_cost<=money) {
									System.out.println("total purchase cost"+total_cost);	
									
								}else {
									System.out.println("you have exceeded your wallet range,please add money to your wallet");
								}
							}
						
					}System.out.println("WOULD YOU LIKE TO SHOP FROM ANOTHER CATEGORY OF PRODUCTS");
					System.out.println("ENTER \"Y\",TO CONTINUE");
					Scanner opt=new Scanner(System.in);
					String choice=opt.nextLine();
					if(choice.equalsIgnoreCase("y")) {
						flag2=1;
					}
					else {
						System.out.println("***THANK YOU FOR SHOPPING, VISIT AGAIN***");
						break;
					}
		}else if(selectedCG.equalsIgnoreCase("snacks")) {
			System.out.println(snacksInfoAL);
			System.out.println("Enter the number of products you would like to buy");
			Scanner number=new Scanner(System.in);
			int num=number.nextInt();
			//int total_cost=0;
			for (int i=0;i<num;i++) {
				System.out.println("Enter the name of item");
				Scanner item=new Scanner(System.in);
				String itemName=item.nextLine();
				for(int j=0;j < snacksInfoAL.size();j++)
				if (itemName.equalsIgnoreCase(snacksInfo[j])&&(total_cost<=money)) {
					System.out.println("Enter the quantity required");
					Scanner quan=new Scanner(System.in);
					int quantity=quan.nextInt();
					System.out.println("Cost per unit:"+snacksPrice[j]);
					int  single_cost=quantity*snacksPrice[j];
					System.out.println("The cost of "+snacksInfo[j]+" of quantity "+quantity+" is "+single_cost);
					
						total_cost +=single_cost;
					
					if(total_cost<=money) {
						System.out.println("total purchase cost"+total_cost);	
						
					}else {
						System.out.println("you have exceeded your wallet range,please add money to your wallet");
					}
				}
			
		}System.out.println("WOULD YOU LIKE TO SHOP FROM ANOTHER CATEGORY OF PRODUCTS");
		System.out.println("ENTER \"Y\",TO CONTINUE");
		Scanner opt=new Scanner(System.in);
		String choice=opt.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			flag2=1;
		}
		else {
			System.out.println("***THANK YOU FOR SHOPPING, VISIT AGAIN***");
			break;
		}
	}	else {
		System.out.println(cosmeticInfoAL);
		System.out.println("Enter the number of products you would like to buy");
		Scanner number=new Scanner(System.in);
		int num=number.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.println("Enter the name of item");
			Scanner item=new Scanner(System.in);
			String itemName=item.nextLine();
			for(int j=0;j < cosmeticInfoAL.size();j++)
			if (itemName.equalsIgnoreCase(cosmeticInfo[j])&&(total_cost<=money)) {
				System.out.println("Enter the quantity required");
				Scanner quan=new Scanner(System.in);
				int quantity=quan.nextInt();
				System.out.println("Cost per unit:"+cosmeticsPrice[j]);
				int  single_cost=quantity*cosmeticsPrice[j];
				System.out.println("The cost of "+cosmeticsPrice[j]+" of quantity "+quantity+" is "+single_cost);
				total_cost +=single_cost;
				if(total_cost<=money) {
					System.out.println("total purchase cost"+total_cost);	
					
				}else {
					System.out.println("you have exceeded your wallet range,please add money to your wallet");
				}
			}
		
	}System.out.println("WOULD YOU LIKE TO SHOP FROM ANOTHER CATEGORY OF PRODUCTS");
	System.out.println("ENTER \"Y\",TO CONTINUE");
	Scanner opt=new Scanner(System.in);
	String choice=opt.nextLine();
	if(choice.equalsIgnoreCase("y")) {
		flag2=1;
	}
	else {
		System.out.println("***THANK YOU FOR SHOPPING, VISIT AGAIN***");
		break;
	}
	}
}else {
	System.out.println("PLEASE ADD MONEY TO YOUR WALLET TO PROCEED\n");
}
}
}
}	
}
}


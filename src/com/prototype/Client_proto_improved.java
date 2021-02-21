package com.prototype;

public class Client_proto_improved {

	public static void main(String[] args) {
		
		// tradition method
		Sheep sheep0 = new Sheep("Atom", "白色", 5);
		// copy
		Sheep sheeptradition = new Sheep(sheep0.getName(), sheep0.getColor(), sheep0.getAge());
		
		
		Sheep sheep = new Sheep("tom", "白色", 1);
		sheep.friend = new Sheep("jacak", "黑色", 2);

		Sheep sheep1 = (Sheep) sheep.clone();
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();

		System.out.println("sheep1 =" + sheep1 + "sheep1.friend=" + sheep1.friend.hashCode());
		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());

	}
}
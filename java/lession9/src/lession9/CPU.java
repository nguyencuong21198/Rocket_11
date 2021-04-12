package lession9;

public class CPU {
	private int price;

	public CPU(int price) {
		this.price = price;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CPU [price=" + price + "]";
	}

	public class Processor {
		private int coreAmount;
		private String manufacturer;

		public Processor(int coreAmount, String manufacturer) {

			this.coreAmount = coreAmount;
			this.manufacturer = manufacturer;
		}

		public int getCoreAmount() {
			return coreAmount;
		}

		public void setCoreAmount(int coreAmount) {
			this.coreAmount = coreAmount;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public float getCache() {
			return 4.3f;
		}

	}

	public class Ram {
		private String manufacturer;
		private String memory;

		public Ram(String manufacturer, String memory) {
			
			this.manufacturer = manufacturer;
			this.memory = memory;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getMemory() {
			return memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}
		public float getClockSpeed() {
			return 5.5f;
		}
	}

}

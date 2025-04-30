package textbook.Week02;

public class Week02_p167_PhoneStore {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 1000000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("김유영", 1000000);
        customer.buyPhone(store);
    }

    // 대리점 클래스 구현하기
    public static class PhoneStore {
        private Phone phone;

        public PhoneStore(Phone phone) {
            this.phone = phone;
        }

        // 구입하려는 모델과 예산이 매개변수
        public Phone sellPhone(String model, double budget) {
            String phoneModel = phone.getModel();

            //고객이 원하는 모델과 대리점에서 가지고 있는 핸드폰 모델이 같고,
            // 핸드폰의 가격이 예산보다 작거나 같으면
            if (model.equals(phoneModel) && budget >= phone.getPrice()) {
                registerPayment();
                discountPromotion();
                saveData();
                return phone;
            }
            else return null;
        }

        private void registerPayment() {
            System.out.println("대리점: 요금제를 등록합니다. 약정을 등록합니다.");
        }

        private void discountPromotion() {
            System.out.println("대리점: 프로모션으로 할인합니다.");
        }

        private void saveData() {
            System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동합니다.");
        }
    }

    // 핸드폰 클래스 구현하기
    public static class Phone {
        private String model;
        private double price;

        public Phone(String model, double price) {
            this.model = model;
            this.price = price;
        }

        // getModel()과 getPrice()는 값을 가져올 때 사용하는 역할
        public String getModel() {
            return model;
        }

        public double getPrice() {
            return price;
        }
    }

    // 핸드폰 구매 고객 클래스 구현하기
    public static class Customer {
        private String name;
        private double budget;

        public Customer(String name, double budget) {
            this.name = name;
            this.budget = budget;
        }

        // 값을 꺼내올 때 사용
        public double getBudget() {
            return budget;
        }

        public void buyPhone(PhoneStore store) {
            Phone phone = store.sellPhone("아이폰", budget);
            if (phone != null) {
                System.out.println("고객: 핸드폰 구입이 완료되었습니다.");
            }
            else {
                System.out.println("고객: 핸드폰을 구입하지 못했습니다.");
            }
        }
    }
}

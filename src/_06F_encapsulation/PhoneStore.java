package _06F_encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    // 판매가 가능한지 확인해서 판매가 가능하면 판매할 폰을 반환, 판매가 불가능하면 null
    pubilc Phone sellPhone() {
        // 폰 가격보다 고객의 예산이 크거나 같고 모델이 같으면 판매가 가능
        if(phone.getPrice()) {

        }
    }
}

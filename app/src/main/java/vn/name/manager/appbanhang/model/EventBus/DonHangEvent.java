package vn.name.manager.appbanhang.model.EventBus;

import vn.name.manager.appbanhang.model.DonHang;

public class DonHangEvent {
    DonHang donHang;

    public DonHangEvent(DonHang donHang) {
        this.donHang = donHang;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }
}

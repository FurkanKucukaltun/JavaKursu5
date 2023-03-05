package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    // eğer protected olan değeri extend yaparaK BAŞKA BİR classta alırsak o zaman protected değere erişebiliriz
    // extend yapılmış olan sayfaya. default olarak kalsaydı bu şekilde de alamazdık

    public P2Kedi(String ad, String cins) {
        this.ad=ad;
        this.cins=cins;
    }

}

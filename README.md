# Oyun-Satis-Sistemi-Simulasyonu
Engin Demiroğun düzenlemiş olduğu (Java &amp; React) Yazılım Geliştirici Yetiştirme Kampında verilen ödev3'ü içermektedir.
Bir oyun yazmak istiyorsunuz. Bu yazılım için backend kodlarını JAVA ile geliştirmeyi planlıyoruz. Yeni üye, satış ve kampanya yönetimi yapılması isteniyor. Nesnelere ait özellikleri istediğiniz gibi verebilirsiniz. Burada amaç yazdığınız kodun kalitesidir. Ödevde gereksinimleri tam anlamadığınız durum benim için önemli değil, kendinize göre mantık geliştirebilirsiniz. Dediğim gibi kod kalitesiyle ilgileniyoruz şu an :)

Gereksinimler

1.     Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule ediniz. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.     Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir. Oyuncunun parametre olarak metotta olmasını kastediyorum.)

3.     Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.

4.     Satışlarda kampanya entegrasyonunu simule ediniz.

Bu proje ile bir oyun satış sistemi simülasyonun backend kodları java kodları ile yazılmıştır. Oyuncuların gerekli verileri Main class'ında objeler oluşturularak üretilmiştir. Oluşturulan ödev kapsamında FreeGamer ve PremiumGamer tipinde 2 oyuncu tipi oluşturulmuş ve bu oyuncu tiplerine ait nesneler , bu nesnelere ait işlemelerin yapıldığı classlar nesne yönelimli programlamanın tüm imkanlarından faydalanarak üretilmiştir. Oyun satışında PremiumGamer tipinde kullanıcıların sahip olduğu kampanyalar oyun satın alma işlemlerine başarılı bir şekilde yansıtılmıştır. Yine ödevde belirtilen ister üzerine Edevletten kullanıcı bilgilerine ait loglama işlemi simüle edilmiştir. Ödev loglama işlemi , yeni kampanya girişi güncellenmesi silinmesi , kampanyaların satışlara olan entegrasyonu , satış simülasyonu gibi isterlerin tamamını karşılamaktadır. Ödevde söylenmediği halde oyuncuların sahip oldukları aynı oyunu bir daha satın almamaları veya kampanyalara dahil olmamaları , sahip olmadıkları oyunlara veya kampanyalara güncelleme ve silme işlemleri yapamamalarını sağlamak adına 2 adet validation class'ı içermektedir. Bu validation classları başarı ile uygulanmıştır. Gerekli açıklamalar detaylı bir şekilde java dosyalarında kodların içerisinde yapılmıştır. Kafanıza takılan sorular veya daha iyi iyileştirmeler yapılmasını istediğiniz takdirde iletişime geçmekten çekinmeyin lütfen.

# S17D3
 Zoo Rest Api

Hedeflerimiz:
Zoo Rest Api

Başlangıç
Spring Initializr kullanarak bir Spring Boot projesi oluşturun.
İçerisinde Spring Web dependency eklenmeli.
Maven dependency management sistemini kullanarak tüm dependencyleri install edin.
Uygulamanızı 9000 portundan ayağa kaldırın.
Bir hayvanat bahçesi için rest api dizayn etmeniz istenmektedir.

Görev 1

main metodunuz com.workintech.zoo paketi altında olmalıdır
com.workintech.zoo paketi altında controller, entity, exceptions isminde 3 adet daha paket oluşturunuz.
Project Lombok'u dependency olarak uygulamanıza ekleyin.
entity paketinin altına Koala ve Kangaroo isimli iki tane sınıf oluşturunuz.
Koala sınıfı id, name, weight, sleepHour, gender isimli 5 fielda sahip olmalı.
Kangaroo sınıfı id, name, height, weight, gender, isAggressive isimli 6 fielda sahip olmalı.
Koala ve Kangaroo sınıfları project lombok annotationlarını kullanarak oluşturulmalılar.

Görev 2

KangarooController ve KoalaController isimli 2 tane controller yazmalısınız.
KangarooController içirisinde kangaroo objelerini tutacak bir adet kangaroos isminde map tutmalısınız. Controller bean ilk oluştuğunda bu map tanımlanmalı.
Amacımız CRUD işlemlerini tanımlayan endpointler yazmak.
[GET]/workintech/kangaroos => tüm kangaroo listini dönmeli.
[GET]/workintech/kangaroos/{id} => İlgili id deki kangaroo objesini dönmeli.
[POST]/workintech/kangaroos => Bir adet kangaroo objesini kangaroos listesine ekler
[PUT]/workintech/kangaroos/{id} => İlgili id deki kangaroo objesinin değerlerini yeni gelen data ile değiştirir.
[DELETE]/workintech/developers/{id} => İlgili id değerindeki kangaroo objesini listeden siler.
KoalaController içirisinde koala objelerini tutacak bir adet koalas isminde Map tutmalısınız. Controller bean ilk oluştuğunda bu map tanımlanmalı.
[GET]/workintech/koalas => tüm koala listini dönmeli.
[GET]/workintech/koalas/{id} => İlgili id deki koala objesini dönmeli.
[POST]/workintech/koalas => Bir adet koala objesini koala listesine ekler
[PUT]/workintech/koalas/{id} => İlgili id deki koala objesinin değerlerini yeni gelen data ile değiştirir.
[DELETE]/workintech/koalas/{id} => İlgili id değerindeki koala objesini listeden siler.

Görev 3

Her endpointin hata fırlatabileceği senaryolar düşünülmeli exceptions paketi altına bu Error sınıfları oluşturulmalı.
Error Handling Global bir merkezden yönetilmeli. Controller sınıflarının altında olmamalı.
@Slf4j bir şekilde hata dönüldüğünde error logu basılmalı.
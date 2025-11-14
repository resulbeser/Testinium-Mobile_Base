# 📱 Testinium Mobile Base Project - Cucumber Edition

Bu proje Kitapyurdu mobil uygulamasını test etmek için Cucumber + Appium tabanlı bir mobil test otomasyon frameworküdür.

## 🚀 Özellikler

- **Cucumber BDD Framework** - Gherkin syntax ile yazılmış test senaryoları
- **Appium Mobile Testing** - Android cihazlarda mobil uygulama testi
- **TestNG Integration** - Paralel test çalıştırma ve raporlama
- **Page Object Model** - Sürdürülebilir ve tekrar kullanılabilir kod yapısı
- **Comprehensive Reporting** - HTML, JSON ve JUnit formatında raporlar

## 📋 Gereksinimler

### Yazılım Gereksinimleri
- **Java 21** veya üzeri
- **Maven 3.6+**
- **Android SDK**
- **Appium Server 2.0+**
- **Node.js** (Appium için)

### Mobil Cihaz/Emülatör
- **Android Emülatör**
- **Kitapyurdu Uygulaması** yüklü olmalı

## 🛠️ Kurulum

### 1. Projeyi klonlayın
```bash
git clone [repository-url]
cd Testinium_Mobile_Base_ProjectV01
```

### 2. Dependencies yükleyin
```bash
mvn clean install

## 🎯 Test Çalıştırma

### Temel Test Çalıştırma
```bash
# Tüm smoke testleri çalıştır
mvn test

# Belirli tag'li testleri çalıştır
mvn test -Dcucumber.filter.tags="@kitapyurdu"

# Regresyon testleri çalıştır
mvn test -Dcucumber.filter.tags="@regression"
```

### Test Senaryoları

- Kampanyalar Sayfası Görüntüleme
- Sepete Ürün Ekleme
- Kullanıcı Başarılı Giriş
- Başarılı Kitap Arama

## 📁 Proje Yapısı

```
src/test/
├── java/com/testinium/And/
│   ├── Backend
│   ├── Model
│   ├── PageElement
│   ├── Pages
│   ├── PageSteps
│   ├── runners
│   └── Util
└── resources/
    ├── features/
    │   ├── addtocart.feature                 # Kitapyurdu Sepet Senaryoları
    │   ├── kampanyalar.feature               # Kitapyurdu Kampanyalar Senaryoları
    │   ├── login.feature                     # Kitapyurdu Login Senaryoları
    └── └── search_functionality.feature      # Kitapyurdu Arama Senaryoları
```

## ⚙️ Konfigürasyon

### Properties Dosyası (`env/default/default.properties`)
```properties
# Appium Server Ayarları
appium.server.url=http://127.0.0.1:4723/wd/hub
android.device.name=emulator-5554

# Kitapyurdu Uygulama Ayarları
app.package=com.mobisoft.kitapyurdu
app.activity=com.mobisoft.kitapyurdu.main.SplashActivity

# Test Ayarları
test.timeout=30
implicit.wait=10
```

## 📊 Raporlar

Test çalıştırıldıktan sonra raporlar şu konumda oluşturulur:
- **HTML Rapor**: `target/cucumber-reports/index.html`
- **JSON Rapor**: `target/cucumber-reports/Cucumber.json`
- **JUnit XML**: `target/cucumber-reports/Cucumber.xml`

## 🔧 Troubleshooting

### Sık Karşılaşılan Sorunlar

1. **Appium Server bağlantı hatası**
   ```bash
   # Appium server'ın çalıştığını kontrol edin
   curl http://127.0.0.1:4723/wd/hub/status
   ```

2. **Emülatör bulunamıyor**
   ```bash
   # Çalışan emülatörleri listeleyin
   adb devices
   ```

3. **Kitapyurdu uygulaması yüklü değil**
   ```bash
   # Uygulamayı emülatöre yükleyin
   adb install kitapyurdu.apk
   ```

## 📝 Notlar

- Bu proje **Gauge framework**'ünden **Cucumber**'a dönüştürülmüştür
- Mevcut page object yapısı korunmuştur
- Tüm hook'lar Cucumber formatına uyarlanmıştır
- Modern Appium W3C Actions API kullanılmaktadır

---

**Geliştirici**: Testinium Team  
**Versiyon**: 2.0 (Cucumber Edition)  
**Son Güncelleme**: 2025

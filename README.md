# بازآرایی کد (Code Refactoring)
## گزارش پروژه
1. ابتدا پروژه را اجرا کرده و خروجی آن را ذخیره می‌کنیم تا در فرآیند بازآرایی توجه داشته باشیم که خروجی تغییر نکند.
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/720109af-3ec9-41ab-90d4-c0343d74b3a9)

2. بازآرایی اول: استفاده از الگوی Facade:
   در کد اصلی زیرسیستم پارسر مستقیما از زیرسیستم تولیدکننده کد استفاده کرده است. یعنی یک نمونه از کلاس CodeGenerator ساخته است و مستقیما توابع را روی آن نمونه صدا زده است. برای کاهش پیچیدگی، یک کلاس CodeGeneratorFecade می‌سازیم که در آن آن نمونه ساخته شده و توابع public دارد که فقط توابع CodeGenerator را صدا می‌زنند. استفاده از این کلاس باعث می‌شود دیگر برای استفاده از توابع CodeGenerator درون Parser نیاز نباید از خود کلاس CodeGenerator نمونه‌ای ساخته بشود.
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/634681c8-13ad-4644-b971-85badb4a28e3)

3. بازآرایی دوم: استفاده از الگوی Facade:
    در کد اصلی پارسر مستقیما از lexical analyzer استفاده کرده است. درست مشابه مورد قبل می‌توان با ایجاد یک کلاس Facade برای اسکنر از استفاده مستقیم پارسر از این ماژول جلوگیری کرد. در این کلاس یک نمونه از lexical analyzer ساخته میشود و سپس توابع روی این نمونه صدا زده می‌شوند و خروجی برگردانده می‌شود. در اینجا در پارسر تابع getNextToken استفاده شده است و در کلاس Facade این تابع از زیرسیستم اصلی روی نمونه ساخته شده صدا زده می‌شود و در پارسر یک نمونه از کلاس Facade ساخته شده و تابع getNextToken آن نمونه استفاده می‌شود.
  ![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/5d50bf8d-37ab-4843-96ec-8e1a917daf54)

4. بازآرایی سوم: استفاده از Polymorphism به جای شرط:
این بازآرایی در کد ما در قسمت switch-case ها به کار می‌آید. با حذف یک switch-case و ایجاد کلاس‌هایی مطابق با شرط‌های آن (در صورت امکان) می‌توان در هر یک از کلاس‌ها که همه یک پدر مشترک دارند یک تابع مشخص را override کرد و به این صورت با فراخوانی آن تابع خود به خود کار آن switch-case حذف شده انجام می‌شود و در صورتی که شیئی که تابع روی آن صدا زده می‌شود از هر یک از انواع کلاس‌ها باشد، تابع مربوط به آن کلاس صدا زده می‌شود. در این کد ما می‌توانیم اینام TypeAddress را حذف نموده و آن را با یک اینترفیس جایگزین کنیم که سه کلاس تابع toString آن را پیاده می‌کنند که هر یک نماینده یکی از انواع آدرس هستند. سپس می‌توانیم به جای switch-case ای که با شرط نوع آدرس مقدار مربوط به آن نوع را برمی‌گرداند، فقط تابع toString همان addressType را صدا بزنیم و هر نوعی که این آدرس داشته باشد طبیعتا تابع پیاده شده آن کلاس اجرا می‌شود. همچنین به طور کلی هرجا یک نوع از این اینام استفاده شده باید جایگزین شود با شیئی از کلاس مربوط به آن نوع.
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/63d2266d-6691-4879-a484-7226bf85ea4c)
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/7608a1dc-8f7f-44d9-bb03-6ec7039291c6)
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/bf717126-5240-446f-b707-743b719936b3)
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/cccea9f9-0849-4f28-ad88-ea4615b89813)
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/b3748824-c59e-40d0-ba4f-114768bc9c51)



6. بازآرایی چهارم: جدا بودن Query و Modifier:

7. بازآرایی پنجم: استفاده از Polymorphism به جای شرط:

8. بازآرایی ششم: بازآرایی Self Encapsulated Field:

9. بازآرایی هفتم:





## پرسش‌ها
1. **هر یک از مفاهیم زیر را در حد یک خط توضیح دهید.**
- کد تمیز: کد تمیز، کدی است که خواندن، نگه‌داری (maintenance)، فهمیدن، ایجاد تغییر و توسعه‌ی آن آسان باشد.
- بدهی فنی: بدهی فنی، هزینه‌ی دوباره‌کاری‌ای است که در آینده به علت انتخاب یک روش سریع و موقت به‌جای یک روش خوب‌طراحی‌شده متحمل می‌شویم تا بتوانیم یک ویژگی یا نیازمندی با اولویت بالاتر را در زمان کوتاه‌تری برآورده کنیم.
- بوی بد: بوی بد در حوزه‌ی نرم‌افزار، به طراحی بد یا ویژگی‌های از کد اشاره می‌کند که می‌توانند نگه‌داری (maintenance)، تغییر و توسعه‌ی کد را دشوار کنند یا با بروز مشکلات عمیق‌تری همراه کنند.
2. **طبق دسته‌بندی وب‌سایت refactoring.guru، بوهای بد کد به پنج دسته تقسیم می‌شوند. در مورد هر کدام از این پنج دسته توضیح مختصری دهید.**
- بوی بد Bloaters: این بوی بد به متدها و کلاس‌هایی اشاره دارد که بسیار بزرگ شده‌اند به نوعی که کار کردن با آن‌ها مشکل است. این دست توابع و کلاس‌ها معمولا به خاطر طراحی نادرست، به صورت تدریجی بزرگ و بزرگ‌تر می‌شوند تا به این وضعیت برسند. از جمله مواردی که این بوی بد را می‌دهند، علاوه بر تابع‌های بلند (بیش از ۱۰-۲۰ خط) و کلاس‌های بزرگ با متغیر‌ها و توابع زیاد، می‌توان به استفاده‌ی زیاد از نوع‌داده‌های primitive به جای ایجاد موجودیت‌های کوچک، داشتن لیست پارامتر‌های بلند (بیش از ۳-۴ پارامتر) و تبدیل نکردن مجموعه متغیرهای مرتبط به موجودیت (مانند پارامتر‌هایی که برای اتصال به یک دیتابیس لازم است و به جای قرار داشتن در یک کلاس، دائما با کپی‌پیست در کد قرار داده می‌شود) اشاره کرد.
- بوی بد Object-Orientation Abusers: این دسته از بو‌های بد،‌ ناشی از استفاده‌ی نادرست یا ناقص از اصول Object-oriented programming هستند. مثلا switch-statement ها (به جز آن‌هایی که عملیات ساده‌ای انجام می‌دهند)، bad smell هستند چون می‌توانستند با polymorphism حذف شوند و منطق را در یک جا متمرکز کنند. یا زمانی که برای جلوگیری از لیست پارامترهای بلند، یه سری متغیر برای کلاس تعریف می‌کنیم که فقط بعضی مواقع استفاده می‌شوند و بقیه‌ی اوقات null هستند. ارث‌بری از یک کلاس در حالی که کلاس فرزند، تمام توابع و رفتارهای کلاس پدر را ندارد و داشتن کلاس‌هایی که عملکرد یکسانی دارند اما این عملکرد یکسان در یک جا مجتمع نشده است، نمونه‌های دیگری در این دسته bad smell هستند.
- بوی بد Change Preventers: این بوی بد زمانی احساس می‌شود که وقتی می‌خواهیم تغییری در یک بخش از کد ایجاد کنیم، لازم است در چندین جای دیگر نیز کد را تغییر بدهیم. مثلا وقتی که یک تایپ جدید به یک مجموعه کلاس اضافه کنیم (مثلا یک نوع محصول جدید)، نیاز است کد چند تابع دیگر را تغییر بدهیم. نمونه‌ی رایج دیگری در این دسته، ارث‌بری موازی است یا به عبارتی وجود تناظر در سلسله‌مراتب موجودیت‌ها. این بوی بد وقتی حس می‌شود که با اضافه کردن یک فرزند به یک کلاس، لازم باشد فرزند دیگری به کلاس دیگری اضافه کنیم.
- بوی بد Dispensables: این بوی بد به بخش‌هایی از کد اشاره می‌کند که زائد هستند و با حذف آن‌ها، کد ساده‌تر، قابل فهم‌تر یا efficient تر می‌شود. در ساده‌ترین نوع خود مثلا کامنت‌گذاری بیش از حد یا duplicate code از این نوع هستند. نمونه‌های دیگر، کلاس‌هایی هستند که آن‌قدر functionality ندارند که به overhead ایجاد و نگه‌داری یک کلاس مستقل بیارزد، یا کلاس‌هایی که فقط یک‌سری فیلد دارند و functionality مربوط به این متغیرها را در بر نمی‌گیرند. گاهی هم پس از ایجاد تغیراتی در کد، یک سری متغیر‌ها، پارامتر‌ها، توابع و ... بی‌استفاده می‌شوند که باید حذف شوند.
- بوی بد Couplers: همانطور که از نامش پیداست، این بوی بد به coupling یا وابستگی زیاد میان موجودیت‌ها و عواقب زیاده‌روی در واگذاری مسئولیت‌ها به کلاس‌های دیگر (delegation) اشاره دارد. مثلا وقتی که می‌بینیم یک موجودیت، اطلاعات یک موجودیت دیگر را بیشتر از اطلاعات خودش استفاده می‌کند، احتمالا این bad smell وجود دارد. یا در مثالی دیگر، استفاده‌ی یک کلاس، از فیلد‌ها و توابع داخلی کلاس دیگر، نشان‌دهنده‌ی coupling بالا است و این بوی بد را دارد. نمونه‌ای دیگر، درگیر شدن کلاینت یک سرویس با زنجیره‌ای از فراخوانی هاست و باید مثلا با واگذاری فراخوانی‌ها به یک تابع یا کلاس، از دید کلاینت هاید شود تا تغییرات آتی در روابط کلاس‌ها، مشکلی ایجاد نکند. نمونه‌ی آخر هم وجود یک کلاس است که غالبا functionality خود را به کلاس دیگری واگذار می‌کند و خودش خدمت بالاتری ارائه نمی‌کند که خب بهتر است کلا از میانه حذف شود.
3. **یکی از انواع بوهای بد، Lazy Class است.**
  - **این بوی بد در کدام یک از دسته‌بندی‌های پنج‌گانه قرار می‌گیرد؟** در دسته‌ی Dispensables (کد‌های زائد)
  - **برای برطرف‌کردن این بو، استفاده از کدام بازآرایی‌ها پیشنهاد می‌شود؟**
    1. تکنیک Inline Class: انتقال تمام فیلدها و متد‌های Lazy class به کلاسی که از آن‌ها استفاده می‌کند و حذف Lazy class.
    2. تکنیک Collapse hierarchy: در صورتی که کلاس فرزندی تقریبا مشابه کلاس پدر خود باشد، آن را در کلاس والد ادغام و حذف می‌کنیم.
- **در چه مواقعی باید این بو را نادیده گرفت؟** گاهی برای مشخص کردن امکان توسعه‌ی یک ویژگی در آینده، یک Lazy class ساخته می‌شود. در چنین مواقعی، باید این bad smell را ایگنور کرد و سعی داشت که تعادلی میان صراحت کد و سادگی برقرار کرد.

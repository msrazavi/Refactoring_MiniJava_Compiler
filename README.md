# بازآرایی کد (Code Refactoring)
## گزارش پروژه
1. ابتدا پروژه را اجرا کرده و خروجی آن را ذخیره می‌کنیم تا در فرآیند بازآرایی توجه داشته باشیم که خروجی تغییر نکند.
![image](https://github.com/msrazavi/Refactoring_MiniJava_Compiler/assets/24840082/720109af-3ec9-41ab-90d4-c0343d74b3a9)


3. 

## پرسش‌ها
۱. هر یک از مفاهیم زیر را در حد یک خط توضیح دهید.
- کد تمیز: کد تمیز، کدی است که خواندن، نگه‌داری (maintenance)، فهمیدن، ایجاد تغییر و توسعه‌ی آن آسان باشد.
- بدهی فنی: بدهی فنی، هزینه‌ی دوباره‌کاری‌ای است که در آینده به علت انتخاب یک روش سریع و موقت به‌جای یک روش خوب‌طراحی‌شده متحمل می‌شویم تا بتوانیم یک ویژگی یا نیازمندی با اولویت بالاتر را در زمان کوتاه‌تری برآورده کنیم.
- بوی بد: بوی بد در حوزه‌ی نرم‌افزار، به طراحی بد یا ویژگی‌های از کد اشاره می‌کند که می‌توانند نگه‌داری (maintenance)، تغییر و توسعه‌ی کد را دشوار کنند یا با بروز مشکلات عمیق‌تری همراه کنند.

۲. طبق دسته‌بندی وب‌سایت refactoring.guru، بوهای بد کد به پنج دسته تقسیم می‌شوند. در مورد هر کدام از این پنج دسته توضیح مختصری دهید.
- بوی بد Bloaters: این بوی بد به متدها و کلاس‌هایی اشاره دارد که بسیار بزرگ شده‌اند به نوعی که کار کردن با آن‌ها مشکل است. این دست توابع و کلاس‌ها معمولا به خاطر طراحی نادرست، به صورت تدریجی بزرگ و بزرگ‌تر می‌شوند تا به این وضعیت برسند. از جمله مواردی که این بوی بد را می‌دهند، علاوه بر تابع‌های بلند (بیش از ۱۰-۲۰ خط) و کلاس‌های بزرگ با متغیر‌ها و توابع زیاد، می‌توان به استفاده‌ی زیاد از نوع‌داده‌های primitive به جای ایجاد موجودیت‌های کوچک، داشتن لیست پارامتر‌های بلند (بیش از ۳-۴ پارامتر) و تبدیل نکردن مجموعه متغیرهای مرتبط به موجودیت (مانند پارامتر‌هایی که برای اتصال به یک دیتابیس لازم است و به جای قرار داشتن در یک کلاس، دائما با کپی‌پیست در کد قرار داده می‌شود) اشاره کرد.
- بوی بد Object-Orientation Abusers: این دسته از بو‌های بد،‌ ناشی از استفاده‌ی نادرست یا ناقص از اصول Object-oriented programming هستند. مثلا switch-statement ها (به جز آن‌هایی که عملیات ساده‌ای انجام می‌دهند)، bad smell هستند چون می‌توانستند با polymorphism حذف شوند و منطق را در یک جا متمرکز کنند. یا زمانی که برای جلوگیری از لیست پارامترهای بلند، یه سری متغیر برای کلاس تعریف می‌کنیم که فقط بعضی مواقع استفاده می‌شوند و بقیه‌ی اوقات null هستند. ارث‌بری از یک کلاس در حالی که کلاس فرزند، تمام توابع و رفتارهای کلاس پدر را ندارد و داشتن کلاس‌هایی که عملکرد یکسانی دارند اما این عملکرد یکسان در یک جا مجتمع نشده است، نمونه‌های دیگری در این دسته bad smell هستند.

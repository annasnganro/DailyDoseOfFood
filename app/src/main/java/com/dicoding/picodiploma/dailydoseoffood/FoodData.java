package com.dicoding.picodiploma.dailydoseoffood;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Bakmi Ayam",
            "Cendol Dawet",
            "Es Campur",
            "Gado Gado",
            "Indomie",
            "Martabak",
            "Nasi Kecap",
            "Nasi Tim",
            "Sate",
            "Sayur Asam",
            "Soto Ayam",
            "Tempe Tahu",
    };
    private static String[] foodDesc = {
            "Mie ayam, mi ayam or bakmi ayam (Indonesian for 'chicken bakmi') is a common Southeast Asian dish of seasoned yellow wheat noodles topped with diced chicken meat (ayam).It especially common in Indonesia, Singapore and Malaysia, and can trace its origin to Chinese cuisine.In Indonesia, the dish is recognized as a popular Chinese Indonesian dish,served from simple travelling vendor carts frequenting residential areas, humble street-side warung to restaurants.",
            "Cendol is an iced sweet dessert that contains droplets of green rice flour jelly, coconut milk and palm sugar syrup.It is commonly found in Southeast Asia and is popular in Indonesia, Malaysia, Brunei, Cambodia, East Timor, Vietnam, Thailand, Singapore, and Burma. Next to the green jelly, additional toppings might be added, including diced jackfruit, sweetened red azuki beans,or durian.",
            "In Indonesia, es campur is sold from humble traveling trolley to restaurants. For Indonesian Muslims, es campur and kolak are popular treats during Ramadan for iftar, often sold prior to breaking the fast. It is quite similar to es teler and es doger although with different content.The ingredients consists of coconut, sea weed, milk, syrup, jackfruit, and many others.",
            "Gado-gado (Indonesian or Betawi), also known as Lotek (Sundanese and Javanese), is an Indonesian salad of slightly boiled, blanched or steamed vegetables and hard-boiled eggs, boiled potato, fried tofu and tempeh, and lontong (rice wrapped in a banana leaf), served with a peanut sauce dressing.In 2018, gado-gado is promoted as one of 5 national dishes of Indonesia.",
            "Indomie is a brand of instant noodle produced by an Indonesian company; Indofood Sukses Makmur Tbk, better known as Indofood.It is distributed in Australia, Asia, Africa, New Zealand, United States, Canada, Europe, and Middle Eastern countries. Outside its main manufacturing plants in Indonesia, Indomie is also produced in Nigeria since 1995 where it is a popular brand and has the largest instant noodle manufacturing plant in Africa.",
            "Apam balik (English: 'turnover pancake')or terang bulan (English: 'bright moon') or martabak manis (English: 'sweet martabak') or 曼煎粿 Màn Jiān Guǒ (English: 曼煎 Màn Jiān is the homophone of 滿清 Mǎn Qīng, which was the final imperial dynasty in China and 粿 Guǒ means pancake) is a dessert common in Southeast Provinces of China and Taiwan as well as Maritime Southeast Asia. It can be found in Quanzhou, Hong Kong and Taiwan, and it is also sold in many varieties at specialist roadside stalls throughout Brunei, Indonesia, Malaysia and Singapore.",
            "“If you don’t have what you like, try to like what you have.”maybe this is the right quote for this food.Usually served near the end of the month when you haven't got your paycheck yet, haven't got money from your parents, for being a big-spender, or when clients haven't paying up the fee yet. ",
            "Nasi tim is a Chinese-Indonesian steamed chicken rice.In Indonesian language nasi means (cooked) rice and tim means steam. The ingredients are chicken, mushroom and hard boiled egg. These are seasoned in soy sauce and garlic, and then placed at the bottom of a tin bowl. This tin bowl is then filled with rice and steamed until cooked. This dish is usually served with light chicken broth and chopped leeks.",
            "Satay, or sate in Indonesian spelling, is a Southeast Asian dish of seasoned, skewered and grilled meat, served with a sauce.It is a dish from Indonesia, and popular in Malaysia, Singapore, Thailand, and Brunei.Satay may consist of diced or sliced chicken, goat, mutton, beef, pork, fish, other meats, or tofu; the more authentic version uses skewers from the midrib of the coconut palm frond, although bamboo skewers are often used. These are grilled or barbecued over a wood or charcoal fire, then served with various spicy seasonings. Satay can be served in various sauces, however most often they are served in a combination of soy and peanut sauce.Hence, peanut sauce is often called satay sauce.",
            "Sayur asem or sayur asam is a Southeast Asian vegetable soup originating from Indonesia. It is a popular Indonesian dish, consisting of vegetables in tamarind soup.Common ingredients are peanuts, young jackfruit, young leaves and unpeeled seeds of melinjo, bilimbi, chayote, long beans, all cooked in tamarind-based soups and sometimes enriched with beef stock. Quite often, the recipe also includes corn.",
            "Soto ayam is a yellow spicy chicken soupwith lontong or nasi himpit or ketupat (all compressed rice that is then cut into small cakes) and/or vermicelli or noodles, it is from Indonesia, and popular in Singapore, Malaysia and Suriname. Turmeric is added as one of its ingredients to get yellow chicken broth. It is probably the most popular variant of soto, a traditional soup commonly found in Indonesian cuisine. Besides chicken and vermicelli, it can also be served with hard-boiled eggs, slices of fried potatoes, Chinese celery leaves, and fried shallots. Coconut milk is sometimes used as an ingredient.Occasionally, people will add \"koya\", a powder of mixed prawn crackers with fried garlic or orange colored spicy sambal, krupuk or emping is a very common topping.",
            "Tempeh or tempe is a traditional Indonesian soy product, that is made from fermented soybeans. It is made by a natural culturing and controlled fermentation process that binds soybeans into a cake form.Here a special fungus is used, which has the Latin name Rhizopus oligosporus, usually marketed under the name Tempeh starter, And Tofu, also known as bean curd, is a food prepared by coagulating soy milk and then pressing the resulting curds into solid white blocks of varying softness; it can be silken, soft, firm, or extra firm. Beyond these broad categories, there are many varieties of tofu. It has a subtle flavor, so it can be used in savory and sweet dishes.",
    };
    private static int[] foodPhoto = {
            R.drawable.bakmi_ayam,
            R.drawable.cendol,
            R.drawable.es_campur,
            R.drawable.gado_gado,
            R.drawable.indomie,
            R.drawable.martabak,
            R.drawable.nasi_kecap,
            R.drawable.nasi_tim,
            R.drawable.sate,
            R.drawable.sayur_asam,
            R.drawable.soto_ayam,
            R.drawable.tempe_tahu,
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position=0;position<foodNames.length;position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDesc(foodDesc[position]);
            food.setPhoto(foodPhoto[position]);
            list.add(food);

        }
        return list;
    }

//    public static ArrayList<Food> getListData(){
//        ArrayList<Food> food = new ArrayList<>();
//        food.add(new Food("Pahlawan 1 ", "Asal 1" , R.drawable.bakmi_ayam));
//        hero.add(new Hero("Pahlawan 2 ", "Asal 2" , R.drawable.pahlawan_2));
//        hero.add(new Hero("Pahlawan 3 ", "Asal 3" , R.drawable.pahlawan_3));
//        hero.add(new Hero("Pahlawan 4 ", "Asal 4" , R.drawable.pahlawan_4));
//        hero.add(new Hero("Pahlawan 5 ", "Asal 5" , R.drawable.pahlawan_5));
//        hero.add(new Hero("Pahlawan 6 ", "Asal 6" , R.drawable.pahlawan_6));
//        hero.add(new Hero("Pahlawan 7 ", "Asal 7" , R.drawable.pahlawan_7));
//        hero.add(new Hero("Pahlawan 8 ", "Asal 8" , R.drawable.pahlawan_8));
//        hero.add(new Hero("Pahlawan 9 ", "Asal 9" , R.drawable.pahlawan_9));
////        hero.add(new Hero("Pahlawan 10 ", "Asal 10" , R.drawable.pahlawan_10));
//        return food;
//    }


}

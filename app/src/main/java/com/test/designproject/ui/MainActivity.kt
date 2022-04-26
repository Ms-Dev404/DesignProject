package com.test.designproject.ui

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.designproject.R
import com.test.designproject.adapter.*
import com.test.designproject.databinding.ActivityMainBinding
import com.test.designproject.model.DataSet

class MainActivity : AppCompatActivity() {

    var adapter:StatusAdapter?=null
    lateinit var categoryAdapter:CategoryAdapter
    lateinit var offerAdapter: OfferAdapter
    lateinit var hotDealsAdapter: HotDealsAdapter
    lateinit var dataList:ArrayList<DataSet>
    lateinit var catList:ArrayList<DataSet>
    lateinit var offerlist:ArrayList<DataSet>
    lateinit var hotlist:ArrayList<DataSet>
    lateinit var products:ArrayList<DataSet>
    lateinit var expolist:ArrayList<DataSet>
    lateinit var  model:DataSet
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataList=ArrayList()
        catList=ArrayList()
        offerlist= ArrayList()
        hotlist=ArrayList()
        products= ArrayList()
        expolist=ArrayList()
        binding.statusRv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvShops.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        binding.rvCat.layoutManager=GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        binding.rvOffer.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvDeals.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvArrivals.layoutManager=GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        for(i in 1..5){

           if(i==1){

             model=DataSet("e-stories",R.drawable.stat_1)

           }else if(i==2){
               model=DataSet("MyG",R.drawable.stat_2)

           }else if(i==3){

               model=DataSet("KFC",R.drawable.stat_3)


        }else if(i==4){

            model=DataSet("WoodLand",R.drawable.stat_4)


        }else if(i==5){

            model=DataSet("Mac",R.drawable.stat_5)
        }

            dataList.add(model)
        }

       var list:ArrayList<DataSet>
       list= ArrayList()
        for(i in 1..4){

            if(i==1){

                model=DataSet("Allen Solly",R.drawable.mask_group1)

            }else if(i==2){
                model=DataSet("KFC",R.drawable.mask_g2)

            }else if(i==3){

                model=DataSet("MyG",R.drawable.mask_4)


            }else if(i==4){

                model=DataSet("WoodLand",R.drawable.mask_3)
            }

            list.add(model)

        }


        adapter= StatusAdapter(dataList,this,0)
        binding.statusRv.adapter=adapter
        binding.rvShops.adapter=StatusAdapter(list,this,1)




        for(i in 1..4){

            if(i==1){

                model=DataSet("Food",R.drawable.cat_food)

            }else if(i==2){
                model=DataSet("Accessories",R.drawable.cat_accs)

            }else if(i==3){

                model=DataSet("Perfumes",R.drawable.cat_perfum)


            }else if(i==4){

                model=DataSet("Books",R.drawable.books)
            }

            catList.add(model)
        }

        categoryAdapter= CategoryAdapter(catList,this)
        binding.rvCat.adapter=categoryAdapter



        for(i in 1..2){

            if(i==1){

                model=DataSet("Food",R.drawable.offer)

            }else if(i==2){

            }
                model=DataSet("Accessories",R.drawable.offer)


            offerlist.add(model)
        }

        offerAdapter= OfferAdapter(offerlist,this)
        binding.rvOffer.adapter=offerAdapter


        for(i in 1..3){

            if(i==1){

                model=DataSet("Food",R.drawable.cos)

            }else if(i==2){

                model=DataSet("Accessories",R.drawable.brand)
            }

            else if(i==3){

                model=DataSet("Accessories",R.drawable.women)
            }



            hotlist.add(model)
        }

        hotDealsAdapter= HotDealsAdapter(hotlist,this)
        binding.rvDeals.adapter=hotDealsAdapter


        for(i in 1..4){

            if(i==1){

                model=DataSet("From Rs.10,499",R.drawable.shoe)

            }else if(i==2){

                model=DataSet("From Rs.10,499",R.drawable.perfume)
            }

            else if(i==3){

                model=DataSet("From Rs.10,499",R.drawable.per)
            }
            else if(i==4){

                model=DataSet("From Rs.10,499",R.drawable.handbag)
            }



            products.add(model)
        }

        binding.rvArrivals.adapter=ProductAdapter(products,this)


        for(i in 1..2){

            if(i==1){

                model=DataSet("From Rs.10,499",R.drawable.pizza)

            }else if(i==2){

                model=DataSet("From Rs.10,499",R.drawable.bugerr)
            }

            expolist.add(model)
            }

        binding.rvExpo.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvExpo.adapter=ExpoAdapter(expolist,this)

        binding.rvOff.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvOff.adapter=ExpoAdapter(expolist,this)

        binding.rvLunch.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvLunch.adapter=ExpoAdapter(expolist,this)

    }


}
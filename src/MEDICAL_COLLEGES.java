

import javax.swing.*;
import java.awt.*;

public class MEDICAL_COLLEGES {

    JPanel panel14 = new JPanel(new GridBagLayout());
    JButton buttonlogsubback11;
    JButton urlbut11;

    MEDICAL_COLLEGES()
    {
        GridBagConstraints constraint11 = new GridBagConstraints();
        JLabel header10 = new JLabel();
        Font f = new Font("Arial", Font.BOLD, 100);
        header10.setFont(f);
        header10.setText("MEDICAL COLLEGES");
        constraint11.gridx=200;
        constraint11.gridy=10;
        constraint11.gridwidth=100;
        constraint11.gridheight=10;
        panel14.add(header10,constraint11);

        JLabel lab14 = new JLabel();
        String s13 = "<html> <b><u>List of medical colleges in Bangladesh.</u></b> <br> <br> In Bangladesh, a medical school is known as a medical college. Allopathic and Alternative Medicine related medical education at the graduate level is provided by medical colleges.<br>  The colleges are under the jurisdiction of the Ministry of Health and Family Welfare (MoHFW), and are affiliated with a university on the respective region.<br> <table border='5' > <tr> <td>Name of the medical college </td> <td> University </td> <td> college started </td> <td> Number of Students </td> </tr> <tr> <td> Dhaka Medical college </td> <td> DU </td> <td> 1946 </td> <td> 197 </td> </tr> <tr> <td> Sir Salimullah Medical college </td> <td> DU </td> <td> 1972 </td> <td> 197 </td> </tr> <tr> <td> Shaheed suhrawardy Medical college </td> <td> DU </td> <td> 2006 </td> <td> 143 </td> </tr> <tr> <td> Mymensingh Medical college </td> <td> DU </td> <td> 1962 </td> <td> 197 </td> </tr> <tr> <td> Chittagong Medical college </td> <td> CU </td> <td> 1957 </td> <td> 197 </td> </tr> <tr> <td> Rajshahi Medical college </td> <td> RU </td> <td> 1958 </td> <td> 197 </td> </tr> <tr> <td> Sylhet MAG Osmani Medical college </td> <td> SUST </td> <td> 1958 </td> <td> 197 </td> </tr> <tr> <td> Sher-e-Bangla Medical college </td> <td> DU </td> <td> 1968 </td> <td> 197 </td> </tr> <tr> <td> Comilla Medical college </td> <td> CU </td> <td> 1992 </td> <td> 113 </td> </tr> <tr> <td> Rangpur Medical college </td> <td> RU </td> <td> 1970 </td> <td> 197 </td> </tr> <tr> <td> Khulna Medical college </td> <td> RU </td> <td> 1992 </td> <td> 141 </td> </tr> <tr> <td> Shaheed Ziaur Rahman Medical college </td> <td> RU </td> <td> 1992 </td> <td> 141 </td> </tr> <tr> <td> Faridpur Medical college </td> <td> DU </td> <td> 1992 </td> <td> 113 </td> </tr> <tr> <td> Dinajpur Medical college </td> <td> RU </td> <td> 1992 </td> <td> 150 </td> </tr> <tr> <td> Pabna Medical college </td> <td> RU </td> <td> 2008 </td> <td> 57 </td> </tr> <tr> <td> Abdul Malek Ukil Medical college </td> <td> CU </td> <td> 2008 </td> <td> 57 </td> </tr> <tr> <td> COx's Bazar Medical college </td> <td> CU </td> <td> 2008 </td> <td> 57 </td> </tr> <tr> <td> Jessore Medical college </td> <td> RU </td> <td> 2010 </td> <td> 57 </td> </tr> <tr> <td> Satkhira Medical college </td> <td> RU </td> <td> 2011 </td> <td> 52 </td> </tr> <tr> <td> Shahid Syed Nazrul Islam Medical college </td> <td> DU </td> <td> 2011 </td> <td> 52 </td> </tr> <tr> <td> Kushtia Medical college </td> <td> RU </td> <td> 2011 </td> <td> 52 </td> </tr> <tr> <td> Sheikh Sayera Khatun Medical college </td> <td> DU </td> <td> 2011 </td> <td> 52 </td> <tr> <td> Shaheed Tajuddin Ahmad Medical college </td> <td> DU </td> <td> 2013 </td> <td> 52 </td> </tr></tr> <tr> <td> Sheikh Hasina Medical college(Tangail) </td> <td> DU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Sheikh Hasina Medical college(Jamalpur) </td> <td> DU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Colonel Malek Medical college </td> <td> DU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Shaheed M.Monsur Ali Medical college </td> <td> RU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Patuakhali Medical college </td> <td> DU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Rangamati Medical college </td> <td> CU </td> <td> 2014 </td> <td> 51 </td> </tr> <tr> <td> Mugda Medical college </td> <td> DU </td> <td> 2015 </td> <td> 51 </td> </tr> </table>";
        s13+="<br><br> <b><u>List of dental colleges in Bangladesh.</u></b> <br> <br> In Bangladesh, Dental School are well known as Dental College. Like medical education,<br>  dental education are conducted by different Dental College located all over the country. These Dental <br> College are affiliated with Medical faculty of different government funded public University. These Dental College conduct <br> a graduate course known as Bachelor of Dental Surgery (BDS).<br> <table border='5' > <tr> <td>Name of the medical college </td> <td> University </td> <td> college started </td> <td> Number of Students </td> </tr> <tr> <td> Dhaka Dental College </td> <td> DU </td> <td> 1961 </td> <td> 97</td> </tr> <tr> <td> Chittagong medical College Dental Unit </td> <td> CU </td> <td> 1990 </td> <td> 60</td> </tr> <tr> <td> Rajshahi medical College Dental Unit </td> <td> RU </td> <td> 1989 </td> <td> 59</td> </tr> <tr> <td> Shaheed Suhrawardy medical College Dental Unit </td> <td> DU </td> <td> 2011 </td> <td> 56</td> </tr> <tr> <td> Sir Salimullah medical College Dental Unit </td> <td> DU </td> <td> 2011 </td> <td> 52</td> </tr> <tr> <td> Mymensingh medical College Dental Unit </td> <td> DU </td> <td> 2011 </td> <td> 52</td> </tr> <tr> <td> MAG Osmani  medical College Dental Unit </td> <td> SUST </td> <td> 2011 </td> <td> 52</td> </tr> <tr> <td> Shere-e-Bangla medical College Dental Unit </td> <td> DU </td> <td> 2011 </td> <td> 52</td> </tr> <tr> <td> Rangpur medical College Dental Unit </td> <td> RU </td> <td> 2011 </td> <td> 52</td> </tr> </table> </html>";
        lab14.setText(s13);
        constraint11.gridx=100;
        constraint11.gridy=100;
        constraint11.gridwidth=200;
        constraint11.gridheight=300;
        panel14.add(lab14,constraint11);

        buttonlogsubback11 = new JButton("Back");
        constraint11.gridx=500;
        constraint11.gridy=200;
        constraint11.gridwidth=  105;
        constraint11.gridheight=50;
        panel14.add(buttonlogsubback11,constraint11);

        urlbut11 = new JButton("For more information click me..");
        constraint11.gridx=500;
        constraint11.gridy=250;
        constraint11.gridwidth=200;
        constraint11.gridheight=50;
        panel14.add(urlbut11,constraint11);

    }
}

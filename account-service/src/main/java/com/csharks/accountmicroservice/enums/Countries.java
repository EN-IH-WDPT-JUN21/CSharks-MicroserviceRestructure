package com.csharks.accountmicroservice.enums;

import java.util.Arrays;

public enum Countries {
    ANDORRA("ANDORRA"), UNITEDARABEMIRATES("UNITED ARAB EMIRATES"), AFGHANISTAN("AFGHANISTAN"), ANTIGUABARBUDA("ANTIGUA & BARBUDA"), ANGUILLA("ANGUILLA"),
    ALBANIA("ALBANIA"), ARMENIA("ARMENIA"), ANGOLA("ANGOLA"), ANTARCTICA("ANTARCTICA"), ARGENTINA("ARGENTINA"), AMERICANSAMOA("AMERICAN SAMOA"), AUSTRIA("AUSTRIA"),
    AUSTRALIA("AUSTRALIA"), ARUBA("ARUBA"), ÅLANDISLANDS("ÅLAND ISLANDS"), AZERBAIJAN("AZERBAIJAN"), BOSNIAHERZEGOVINA("BOSNIA & HERZEGOVINA"), BARBADOS("BARBADOS"),
    BANGLADESH("BANGLADESH"), BELGIUM("BELGIUM"), BURKINAFASO("BURKINA FASO"), BULGARIA("BULGARIA"), BAHRAIN("BAHRAIN"), BURUNDI("BURUNDI"), BENIN("BENIN"), STBARTHÉLEMY("ST BARTHÉLEMY"),
    BERMUDA("BERMUDA"), BRUNEI("BRUNEI"), BOLIVIA("BOLIVIA"), CARIBBEANNETHERLANDS("CARIBBEAN NETHERLANDS"), BRAZIL("BRAZIL"), BAHAMAS("BAHAMAS"), BHUTAN("BHUTAN"), BOUVETISLAND("BOUVET ISLAND"),
    BOTSWANA("BOTSWANA"), BELARUS("BELARUS"), BELIZE("BELIZE"), CANADA("CANADA"), COCOSKEELINGISLANDS("COCOS (KEELING) ISLANDS"), CONGOKINSHASA("CONGO - KINSHASA"), CENTRALAFRICANREPUBLIC("CENTRAL AFRICAN REPUBLIC"),
    CONGOBRAZZAVILLE("CONGO - BRAZZAVILLE"), SWITZERLAND("SWITZERLAND"), CÔTEDIVOIRE("CÔTE D’IVOIRE"), COOKISLANDS("COOK ISLANDS"), CHILE("CHILE"), CAMEROON("CAMEROON"), CHINA("CHINA"),
    COLOMBIA("COLOMBIA"), COSTARICA("COSTA RICA"), CUBA("CUBA"), CAPEVERDE("CAPE VERDE"), CURAÇAO("CURAÇAO"), CHRISTMASISLAND("CHRISTMAS ISLAND"), CYPRUS("CYPRUS"), CZECHREPUBLIC("CZECH REPUBLIC"),
    GERMANY("GERMANY"), DJIBOUTI("DJIBOUTI"), DENMARK("DENMARK"), DOMINICA("DOMINICA"), DOMINICANREPUBLIC("DOMINICAN REPUBLIC"), ALGERIA("ALGERIA"), ECUADOR("ECUADOR"), ESTONIA("ESTONIA"),
    EGYPT("EGYPT"), WESTERNSAHARA("WESTERN SAHARA"), ERITREA("ERITREA"), SPAIN("SPAIN"), ETHIOPIA("ETHIOPIA"), FINLAND("FINLAND"), FIJI("FIJI"), FALKLANDISLANDS("FALKLAND ISLANDS"),
    MICRONESIA("MICRONESIA"), FAROEISLANDS("FAROE ISLANDS"), FRANCE("FRANCE"), GABON("GABON"), UNITEDKINGDOM("UNITED KINGDOM"), GRENADA("GRENADA"), GEORGIA("GEORGIA"), FRENCHGUIANA("FRENCH GUIANA"),
    GUERNSEY("GUERNSEY"), GHANA("GHANA"), GIBRALTAR("GIBRALTAR"), GREENLAND("GREENLAND"), GAMBIA("GAMBIA"), GUINEA("GUINEA"), GUADELOUPE("GUADELOUPE"), EQUATORIALGUINEA("EQUATORIAL GUINEA"),
    GREECE("GREECE"), SOUTHGEORGIASOUTHSANDWICHISLANDS("SOUTH GEORGIA & SOUTH SANDWICH ISLANDS"), GUATEMALA("GUATEMALA"), GUAM("GUAM"), GUINEABISSAU("GUINEA-BISSAU"), GUYANA("GUYANA"),
    HONGKONGSARCHINA("HONG KONG SAR CHINA"), HEARDMCDONALDISLANDS("HEARD & MCDONALD ISLANDS"), HONDURAS("HONDURAS"), CROATIA("CROATIA"), HAITI("HAITI"), HUNGARY("HUNGARY"), INDONESIA("INDONESIA"),
    IRELAND("IRELAND"), ISRAEL("ISRAEL"), ISLEOFMAN("ISLE OF MAN"), INDIA("INDIA"), BRITISHINDIANOCEANTERRITORY("BRITISH INDIAN OCEAN TERRITORY"), IRAQ("IRAQ"), IRAN("IRAN"), ICELAND("ICELAND"),
    ITALY("ITALY"), JERSEY("JERSEY"), JAMAICA("JAMAICA"), JORDAN("JORDAN"), JAPAN("JAPAN"), KENYA("KENYA"), KYRGYZSTAN("KYRGYZSTAN"), CAMBODIA("CAMBODIA"), KIRIBATI("KIRIBATI"), COMOROS("COMOROS"),
    STKITTSNEVIS("ST KITTS & NEVIS"), NORTHKOREA("NORTH KOREA"), SOUTHKOREA("SOUTH KOREA"), KUWAIT("KUWAIT"), CAYMANISLANDS("CAYMAN ISLANDS"), KAZAKHSTAN("KAZAKHSTAN"), LAOS("LAOS"), LEBANON("LEBANON"),
    STLUCIA("ST LUCIA"), LIECHTENSTEIN("LIECHTENSTEIN"), SRILANKA("SRI LANKA"), LIBERIA("LIBERIA"), LESOTHO("LESOTHO"), LITHUANIA("LITHUANIA"), LUXEMBOURG("LUXEMBOURG"), LATVIA("LATVIA"), LIBYA("LIBYA"),
    MOROCCO("MOROCCO"), MONACO("MONACO"), MOLDOVA("MOLDOVA"), MONTENEGRO("MONTENEGRO"), STMARTIN("ST MARTIN"), MADAGASCAR("MADAGASCAR"), MARSHALLISLANDS("MARSHALL ISLANDS"), NORTHMACEDONIA("NORTH MACEDONIA"),
    MALI("MALI"), MYANMAR("MYANMAR (BURMA)"), MONGOLIA("MONGOLIA"), MACAOSARCHINA("MACAO SAR CHINA"), NORTHERNMARIANAISLANDS("NORTHERN MARIANA ISLANDS"), MARTINIQUE("MARTINIQUE"), MAURITANIA("MAURITANIA"),
    MONTSERRAT("MONTSERRAT"), MALTA("MALTA"), MAURITIUS("MAURITIUS"), MALDIVES("MALDIVES"), MALAWI("MALAWI"), MEXICO("MEXICO"), MALAYSIA("MALAYSIA"), MOZAMBIQUE("MOZAMBIQUE"), NAMIBIA("NAMIBIA"),
    NEWCALEDONIA("NEW CALEDONIA"), NIGER("NIGER"), NORFOLKISLAND("NORFOLK ISLAND"), NIGERIA("NIGERIA"), NICARAGUA("NICARAGUA"), NETHERLANDS("NETHERLANDS"), NORWAY("NORWAY"), NEPAL("NEPAL"), NAURU("NAURU"),
    NIUE("NIUE"), NEWZEALAND("NEW ZEALAND"), OMAN("OMAN"), PANAMA("PANAMA"), PERU("PERU"), FRENCHPOLYNESIA("FRENCH POLYNESIA"), PAPUANEWGUINEA("PAPUA NEW GUINEA"), PHILIPPINES("PHILIPPINES"), PAKISTAN("PAKISTAN"),
    POLAND("POLAND"), STPIERREMIQUELON("ST PIERRE & MIQUELON"), PITCAIRNISLANDS("PITCAIRN ISLANDS"), PUERTORICO("PUERTO RICO"), PALESTINIANTERRITORIES("PALESTINIAN TERRITORIES"), PORTUGAL("PORTUGAL"), PALAU("PALAU"), PARAGUAY("PARAGUAY"), QATAR("QATAR"),
    RÉUNION("RÉUNION"), ROMANIA("ROMANIA"), SERBIA("SERBIA"), RUSSIA("RUSSIA"), RWANDA("RWANDA"), SAUDIARABIA("SAUDI ARABIA"), SOLOMONISLANDS("SOLOMON ISLANDS"), SEYCHELLES("SEYCHELLES"), SUDAN("SUDAN"),
    SWEDEN("SWEDEN"), SINGAPORE("SINGAPORE"), STHELENA("ST HELENA"), SLOVENIA("SLOVENIA"), SVALBARDJANMAYEN("SVALBARD & JAN MAYEN"), SLOVAKIA("SLOVAKIA"), SIERRALEONE("SIERRA LEONE"), SANMARINO("SAN MARINO"),
    SENEGAL("SENEGAL"), SOMALIA("SOMALIA"), SURINAME("SURINAME"), SOUTHSUDAN("SOUTH SUDAN"), SÃOTOMÉPRÍNCIPE("SÃO TOMÉ & PRÍNCIPE"), ELSALVADOR("EL SALVADOR"), SINTMAARTEN("SINT MAARTEN"), SYRIA("SYRIA"),
    ESWATINI("ESWATINI"), TURKSCAICOSISLANDS("TURKS & CAICOS ISLANDS"), CHAD("CHAD"), FRENCHSOUTHERNTERRITORIES("FRENCH SOUTHERN TERRITORIES"), TOGO("TOGO"), THAILAND("THAILAND"), TAJIKISTAN("TAJIKISTAN"),
    TOKELAU("TOKELAU"), TIMORLESTE("TIMOR-LESTE"), TURKMENISTAN("TURKMENISTAN"), TUNISIA("TUNISIA"), TONGA("TONGA"), TURKEY("TURKEY"), TRINIDADTOBAGO("TRINIDAD & TOBAGO"), TUVALU("TUVALU"), TAIWAN("TAIWAN"),
    TANZANIA("TANZANIA"), UKRAINE("UKRAINE"), UGANDA("UGANDA"), USOUTLYINGISLANDS("US OUTLYING ISLANDS"), UNITEDSTATES("UNITED STATES"), URUGUAY("URUGUAY"), UZBEKISTAN("UZBEKISTAN"), VATICANCITY("VATICAN CITY"),
    STVINCENTTHEGRENADINES("ST VINCENT & THE GRENADINES"), VENEZUELA("VENEZUELA"), BRITISHVIRGINISLANDS("BRITISH VIRGIN ISLANDS"), USVIRGINISLANDS("US VIRGIN ISLANDS"), VIETNAM("VIETNAM"), VANUATU("VANUATU"),
    WALLISFUTUNA("WALLIS & FUTUNA"), SAMOA("SAMOA"), YEMEN("YEMEN"), MAYOTTE("MAYOTTE"), SOUTHAFRICA("SOUTH AFRICA"), ZAMBIA("ZAMBIA"), ZIMBABWE("ZIMBABWE"), NONE("NONE");

    public final String value;

    private Countries(String value) {
        this.value=value;
    }

    public static Countries getCountry(String sValue) {
        for (Countries country: values()) {
            if(country.value.equals(sValue.toUpperCase()))
                return country;
        }
        return Countries.NONE;
    }
}

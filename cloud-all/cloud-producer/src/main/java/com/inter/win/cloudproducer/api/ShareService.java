�}a  ��  ��|�'������
Q �ׂ��b�pP�A�xq9+4����>�Ҧ���K����W�r��yE��w9�l��rԈ��[��f5�~՚�V�*N�f���j��D}��°�n YIy��;ҨX���#"A���:F�����n�6x�΅�3|���V���wy#�8_"�(I��e�;��dH���z��}�*��Q	��I��C%s\���S\TEq9�{ȭ=���/P��jI��r�����9Z��B�O��mr�4C�O�Ҟk�&v��b�����Ny��,���ǀ�糒g�aeT)�~-�ΟF�� N���z��%��6�/�|Aw�h�S�R?F�zw5�����"��]ܦz��k�l��={73���?Q�i_w�&jΈ+�i��{+�i;b�䚈{��
������|��{�G"��?�(�@�Y^�Y�#��c�g"�����:��ʴi=p��pZņt�ʾ��@&2A�,����hm9�z��7ɱNݢ=l�'X����zt��l�;f�ے/Z��#W�Ed�R���k"#����y�И��n�z���a���1��_�<⦖�8��+p��[�y ��ًn!� �<��L�zu�ϵ4��� �
hlV��z *�j.'�T�{sL�T�k�Ð�o�cH1���Պ�}��9s�;<�y���2 ^甞�?;L�v�5Q���i8�>m�Zʋ��~%u򣉋���X�}�w�F��Ϙ���{Rё>/)�6��u����-#�-Pm�j�գ�g��4�b��<S��ǟ���jH5:��Nhi1xa��O�~/o^g
�E��F���_<��{{s�sp����_�k1/b��X#�˷� X����$�i[��yq�+'P��Z�!s"��� 3���U���������^��H�at�q��ց��b.!�Ndt�I�g$�n�e�\Y1�a夃����#`�݈������%l���$cӲ{2��5p{�vbq��?Zs��ᷤ�n1��<A�igins = "*")
    @GetMapping("/get")
    @ResponseBody
    public Object getShare() {

        return crawlerText.getList();
    }

    @GetMapping
    public String toPage() {
        return "article.html";
    }
}

�}�  ��  �L�$�V:���� Q�ۆd�b��@��j
�	��Z�+����=5�o_�-��,�7�E�싋.��֨��v@��� �[״�������ĉE/�s/��V�ꐷ�1ҁ͹j�E
��ܭ�}�����"��ܐĸ8�G?Ͷ��=���(DvW
:b��	��a2_I�i��]C�؁�~ړ�EӋ�*��o]��"ߎDlc��y�,�*m����H|��4Ͱ���ђE���f�6��$�}ݎT ����v���?���0^��ۗ��(���=n�ǀ�糒g�aeT)�~-�ΟF�� N���z��%��6�/�|Aw�h�S�R?F�zw5�����"��]ܦz��k�l��={73���?Q�i_w�&jΈ+�i��{+�i;b�䚈{��
������|��{�G"��?�(�@�Y^�Y�#��c�g"�����:��ʴi=p��pZņt�ʾ��@&2A�,����hm9�z��7ɱNݢ=Mapping("/get")
    public Object getArticle() {
        return articleService.getShare();
    }
    @GetMapping("/share")
    public void shareArticle() {
        articleService.createShare();
    }

}

�}�  %  �������� Q �Q椫b�p��`A��NJ�C',�,��qA���F>��|��x������	�|(��
��&>W�?�,zi�
��7�a�j�<�2�ڃ�n�9ڞv��Z �~��A(����s4�;[=,��]-��@�8��8���[�QB߸G� �f�gJ�5Է@���?�~��N��G�U�;U���D���8$s�Q�8ǁ2��GȠ�V�}��,�}�y�7����ђE���f�6��$�}ݎT ����v���?���0^��ۗ��(���=n�ǀ�糒g�aeT)�~-�ΟF�� N���z��%��6�/�|Aw�h�S�R?F�zw5�����"��]ܦz��k�l��={73���?Q�i_w�&jΈ+�i��{+�i;b�䚈{��
������|��{�G"��?�(�@�Y^�Y�#��c�g"�����:��ʴi=p��pZņt�ʾ��@&2A�,����hm9�z��7ɱNݢ=l�1�����f�hB�;:���ՙ&�9����0vQ��P�^1��[�{���`�ϳ�I�c{	�εU2�'�p��1�<[G��b���m�^���n!��^0����(mu���q��R:�T��j6_R4�r�I̧#	��k-�R�U�u��.z(]y��+��,& ���7μ�� +����M%j�7�̸P�=�n!�Ҍ)I�Ȳ���j��V�
н�Z�^Z�Lc��*�uH�����,���]����!�oZ�
!�H�Ps�yp<J��稴 P���(�a�*��	?9*b�S��1�R�u�J����ҳN�������aN���H���q��7�T=�ʐ}a��_@r�{��Mz�+�u�X�u���¤�5(���{��B�$e��mܽ�}B�"��ȋM�_J����Q�"���U��Rw^m��	�3O�1�~����A���LD�5�E'U��R|{�׍@'Q��%[��/���URf�G�?�Ƣz�JBl�*��Lt�M��9B����ǽsi[�A����1��lA�ݯ�&�E5,J�>v�Zj�IaF�S�Q��=O�Aаf=���$g�P�ҭ�<��x[>�uL���	��JE�g@�pV/%x�����b�O��K��'}� �0���Ed�
���?P��Z�j����V��]�!�ݙ�9S���}Yu<ߣ��]홑n�m$�)mm�w㘐:����́C`�\Ftu�?J{����_���)�Y���E)�i�����t�pl)3����bB���VWNN��m�dG�<��$qV%j?kLt�{�0CT�W���)�K�Agv��w�:�K^H�
��''-�����=KK�֗'UV�t�M��ӎ(n-����Lz������ɸ檐R����+����}禼ϸsEm.lJ	mK����"�Z�C"I`�t� a#>�D�s��[��p��e���y��i��LS���t4'x8Q��,(*f�_`�s-��32��:\7���]�����h�;�c|r);

        // hash的key也采用String的序列化方式

        template.setHashKeySerializer(stringRedisSerializer);

        // value序列化方式采用jackson

        template.setValueSerializer(jackson2JsonRedisSerializer);

        // hash的value序列化方式采用jackson

        template.setHashValueSerializer(jackson2JsonRedisSerializer);

        template.afterPropertiesSet();

        return template;

    }
}